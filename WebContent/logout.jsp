<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!-- //SCRIPLET FEO -->     

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmación de usuario</title>
		
<link rel="stylesheet" type="text/css" href="estiloscss/estilos.css"/>
</head>
<!-- VALIDAR LOGUEO USUARIO -->
<body>
  <header>
      <h1>Bienvenido a TrackMaster.com</h1> 
  </header>
  <!-- INICIO DE DEFINICION DE ESTILOS DE LA PÁGINA -->
  <form id="FormLogOut" method = 'GET' action="LogOutServlet" >
	<br>
	</br>
	<br>
	</br>
	<!--  <h2>Hola Usuario: ${carro.usuario.nombre }...Acceso Correcto</h2> -->
	<h2> Saliendo del sistema... </h2>
	<fieldset>
		<tr>
			Para confirmar presione el botón salir..
			
			<input type="submit" value="Salir" id=LogoutUsuario></TD>
			
		</tr>
		<!-- 
		<tr>
			<TD><a href="http://localhost:8090/TrackMaster4/Tracking.jsp">Ingresar a pantalla de seguimiento de prodcutos comprados</a></TD>
		</tr>
		-->
	</fieldset>	
</body>
</html>