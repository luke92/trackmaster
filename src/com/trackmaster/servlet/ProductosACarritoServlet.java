package com.trackmaster.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trackmaster.handler.ProductosHandler;
import com.trackmaster.handler.SesionHandler;
import com.trackmaster.modelo.Producto;
import com.trackmaster.vista.CarroCompraVista;

/**
 * Servlet implementation class ProductosACarritoServlet
 */
//@WebServlet("/ProductosACarritoServlet")
public class ProductosACarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductosACarritoServlet() {
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
		
		Integer idProducto = Integer.parseInt(request.getParameter("idProducto"));
		Producto producto = ProductosHandler.getById(idProducto);
		
		SesionHandler s = new SesionHandler(request.getSession());
		CarroCompraVista carro = s.getCarro();
		
		
		carro.getDetalle().addProduct(producto, 1);
		s.setCarro(carro);
		
		response.sendRedirect("carroActual.jsp");
	}

}
