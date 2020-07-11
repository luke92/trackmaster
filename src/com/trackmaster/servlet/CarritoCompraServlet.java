package com.trackmaster.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trackmaster.modelo.Categoria;
import com.trackmaster.modelo.Producto;
import com.trackmaster.handler.CategoriasHandler;
import com.trackmaster.handler.ProductosHandler;

/**
 * Servlet implementation class CarritoCompraServlet
 */
//@WebServlet("/CarritoCompraServlet")
public class CarritoCompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarritoCompraServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		List<Categoria> categorias = CategoriasHandler.getAll();
		List<Producto> productos = ProductosHandler.getTopFive();
		
		request.setAttribute("productos", productos);
		request.setAttribute("categorias", categorias);
		
		request.getRequestDispatcher("carrito.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
				//TENER CARGADO CATEGORIAS EN LISTA DESPLEGABLE (DROP DOWN LIST)
				//CategoriasHandler categoriasHand = new CategoriasHandler();	
				//ArrayList <String> CategoriasMostrar = new ArrayList<String>();
				//CategoriasMostrar=categoriasHand.cargarArrayCategorias();//->productos cargados en arraylist
				//request.setAttribute("CategoriasMostrar", CategoriasMostrar);
				//request.getRequestDispatcher("Carrito.jsp").forward(request, response);
				
				//TENER CARGADO PRODUCTOS
			/*	ProductosHandler productosHand = new ProductosHandler();	
				ArrayList <Productos> productosMostrar = new ArrayList<Productos>();
				productosMostrar=productosHand.cargarArrayProductos();//->productos cargados en arraylist
				*/
				//TENER CARGADO MANUALMENTE CADA PRODUCTO DE LA BD
				//ProductosHandler productosHand = new ProductosHandler();
				//String htmlcode=productosHand.getProductos();
				//String htmlcode2=productosHand.getProductos();
				//String htmlcode2=productosHand.getProductos(2);
				//htmlcode="texto de prueba carajo desde el mismo servlet";
				//request.setAttribute("htmlcode", htmlcode);
				//request.getRequestDispatcher("Carrito.jsp").forward(request, response);
				

	}

}
