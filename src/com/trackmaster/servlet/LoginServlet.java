package com.trackmaster.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trackmaster.vista.CarroCompraVista;
import com.trackmaster.handler.SesionHandler;
import com.trackmaster.handler.UsuarioHandler;
/*
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginWeb.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// 
		System.out.println("Servlet de login");
		//Para validar contenido
		String Usuario;
		String Password;
		
		//contenido de textos
		Usuario 	 = request.getParameter("usuario");
		Password	 = request.getParameter("password");
		System.out.println(Password);
		try
		{
			//VALIDAR PERTINENCIAS DE DATOS INTRODUCIDOS POR USUARIO
			CarroCompraVista carro = UsuarioHandler.nuevoCarro(Usuario);
			if(carro.getUsuario().getPassword().compareTo(Password) == 0)
			{
			//VALIDA ESPACIO EN BLANCO USER/PASS Y EXISTENCIA  -> HANDLER
				  System.out.println("Login exitoso...");
				  //ACTIVAR SESION DE USUARIO REGISTRADO
				  SesionHandler sesionUsuario = new SesionHandler( request.getSession());
				  sesionUsuario.setCarro(carro);
				  response.sendRedirect("CarritoCompraServlet");
			}
			else
			{
				//dirigir a el jsp de error
				System.out.println("No se ingresaron datos O credenciales incorrectas");
				response.sendRedirect("error.jsp");
			}	
		}
		catch(Exception ex)
		{
			System.out.println("ha ocurrido un error en el servidor");
		}
		
	}

}
