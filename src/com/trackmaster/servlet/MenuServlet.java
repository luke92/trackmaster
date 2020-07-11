package com.trackmaster.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trackmaster.handler.CategoriasHandler;

/**
 * Servlet implementation class MenuServlet
 */
//@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServlet() {
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
		new CategoriasHandler();	
		ArrayList <String> CategoriasMostrar = new ArrayList<String>();
		//CategoriasMostrar=categoriasHand.cargarArrayCategorias();//->productos cargados en arraylist
		request.setAttribute("CategoriasMostrar", CategoriasMostrar);
		request.getRequestDispatcher("Carrito.jsp").forward(request, response);
	}

}
