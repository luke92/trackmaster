package com.trackmaster.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class LoginServlet
 */

//@WebServlet("/LoginWeb.jr")
public class LoginAdministrativoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdministrativoServlet() {
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
		/*System.out.println("Servlet de login administrativo");
		//Para validar contenido
		String Usuario;
		String Password;
		String Tabla;
		
		//contenido de textos
		Usuario 	 = request.getParameter("usuariousuarioAdministrativo");
		Password	 = request.getParameter("passwordusuarioAdministrativo");
		//Tabla		 = request.getParameter("tabla");	
		try
		{
			//VALIDAR PERTINENCIAS DE DATOS INTRODUCIDOS POR USUARIO
			//administrativoHandler administrativoHand = new administrativoHandler();
				
			//VALIDA ESPACIO EN BLANCO USER/PASS Y EXISTENCIA  -> HANDLER
			//boolean estado = administrativoHand.validaCredenciales(Usuario, Password);
			//if(estado)
			//{
				  System.out.println("Login exitoso...");
				  // ACTIVAR SESION DE USUARIO REGISTRADO
				  //HttpSession session= request.getSession(true);
				  //session.setAttribute("usuario", Usuario);
				  //redirige a jsp de menú
				  response.sendRedirect("MenuAdministrativo.jsp");		
			//}
			//else
			//{
				//dirigir a el jsp de error
				System.out.println("No se ingresaron datos O credenciales incorrectas");
				response.sendRedirect("Error.jsp");
			//}	
		}
		catch(Exception ex)
		{
			System.out.println("ha ocurrido un error en el servidor");
		}
		*/
	}

}
