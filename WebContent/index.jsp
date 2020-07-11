<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/includes/sesion.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="/includes/Head.jsp"></jsp:include>
	<title>TrackMaster dónde todo se puede comprar</title>
</head>

<body>
	<jsp:include page="/includes/header.jsp" />
  
	<form id="Formlogin" method = 'POST' action="LoginServlet" >
	<br>
	</br>
	<br>
	</br>
	<h2>Inicio de sesión de usuario... </h2>
		<main>
			<fieldset>
			<table>
				<td>Ingresa tu usuario y contraseña:</td>
				<tr> 
    				<td>Usuario:</td>
					<td><input type="text" name="usuario" id="usuario" placeholder="Ingrese usuario" required="required"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" id="password" placeholder="Ingrese password" required="required"></td>
				</tr>
	
				<tr>
					<TD><input type="button" value="Cancelar" >
					<input type="submit" value="Aceptar" id=LoginUsuario></TD>
				</tr>
				<tr>
					<!-- SETEA EL NOMBRE DE LA TABLA PARA QUE LO VAYA A BUSCAR EN EL STORED PROCEDURE DE ORACLE -->
					<td>
					<input type="hidden" value="usuariosClientes" name="tabla" > 
					</td>
				</tr>
				<tr>
					<td>o registrarse...</td>
				</tr>
				<tr>
					<TD><a href="FormularioAlta.jsp">Ingresar Fomulario de Alta de Usuario cliente</a></TD>
					<tr>
					</tr>
					<TD><a href="UsuarioAdministrativo.jsp">Ingreso con usuario administrativo</a></TD>
				</tr>
			</table>
			</fieldset>
		</main>

	</form>
	
</body>
<jsp:include page="/includes/footer.jsp"></jsp:include>
</html>