package com.trackmaster.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//importat package propios

/**
 * Servlet implementation class FomularioServlet
 */
//@WebServlet("/FomularioServlet")
public class FomularioAltaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public FomularioAltaServlet() {
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
		System.out.println("Servlet de Formulario alta");
		//Para validar contenido
		String Usuario;
		String Apellido;
		String Email;
		String Direccion;
		//fin para validar contenido
		
		//Para validar contenido nulo
		Boolean BUsuario;
		Boolean BApellido;
		Boolean BEmail;
		Boolean BDireccion;
		//fin para validar contenido nulo
		
		//contenido de textos
		Usuario 	 = request.getParameter("NombreUsuario");
		Apellido	 = request.getParameter("ApellidoUsuario");
		Email		 = request.getParameter("EmailUsuario");
		request.getParameter("EstadoCuentaUsuario");
		Direccion  	 = request.getParameter("DireccionEnvioUsuario");
		//fin contenido de textos
		
		//Resultados de campos vacios o llenos (false o true)
		BUsuario=Usuario.isEmpty();
		BApellido=Apellido.isEmpty();
		BEmail=Email.isEmpty();
		BDireccion=Direccion.isEmpty();
		
		System.out.println("BUsuario "+ BUsuario);
		System.out.println("BApellido "+ BApellido);
		System.out.println("BEmail "+ BEmail);
		System.out.println("BDireccion "+ BDireccion);
		//fin de Resultados de campos vacios o llenos (false o true)
		//validar datos ingresados no sean nulos
		try
		{
			//ENTRA SOLAMENTE SI SE COMPLETARON TODOS LOS DATOS
			if(BUsuario.equals(false) && BApellido.equals(false) && BEmail.equals(false) && BDireccion.equals(false) )
			{
				//PASÓ POR TODAS LAS VALIDACIONES CAMPOS NULOS Y DE ANÁLISIS DE TEXTO
			    System.out.println("Se completó con TODOS los datos");	   
		
				//instancia la clase validaciones para usar sus metodos
				//ha pasado por todas las pruebas y ahora toca validar si los datos son correctos   
			}
			else
			{
				System.out.println("no se han ingresado datos");
			}	
		}
		catch(Exception ex)
		{
			System.out.println("ha ocurrido un error en el servidor");
			//request.getRequestDispatcher("login.jsp").forward(request, response);
		}	
	}
	
}
