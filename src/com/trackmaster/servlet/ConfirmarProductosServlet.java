package com.trackmaster.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trackmaster.handler.CompraHandler;
import com.trackmaster.handler.SesionHandler;
import com.trackmaster.modelo.DetallePedido;
import com.trackmaster.modelo.Pedido;
import com.trackmaster.modelo.Pedido.EstadoEnvio;
import com.trackmaster.modelo.ProductosAComprar;
import com.trackmaster.services.DetallePedidosService;
import com.trackmaster.services.PedidosService;
import com.trackmaster.vista.CarroCompraVista;

/**
 * Servlet implementation class ConfirmarProductosServlet
 */
//@WebServlet("/ConfirmarProductosServlet")
public class ConfirmarProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmarProductosServlet() {
        super();
        // 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String[] ids = request.getParameterValues("idProducto");
		String[] cantidades = request.getParameterValues("cantidad");
		
		ProductosAComprar productosComprar = CompraHandler.getProductos(ids, cantidades);
		
		SesionHandler sh = new SesionHandler(request.getSession());
		
		Pedido pedido = new Pedido();
		pedido.setIdPedido(PedidosService.getLastId() + 1);
		pedido.setEstado(EstadoEnvio.EN_TRANSITO);
		pedido.setPrecioTotal(productosComprar.getPrecioTotal());
		pedido.setUsuario(sh.getUser());
		PedidosService.save(pedido);
		
		DetallePedido detalle = new DetallePedido();
		detalle.setPedido(pedido);
		detalle.setProductos(productosComprar);
		DetallePedidosService.save(detalle);
		
		CarroCompraVista c = sh.getCarro();
		c.setPedido(new Pedido());
		c.setDetalle(new DetallePedido());
		response.sendRedirect("CarritoCompraServlet");
		
	}

}
