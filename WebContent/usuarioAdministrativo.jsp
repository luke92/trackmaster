<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<<jsp:include page="/includes/sesionAdmin.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido a TrackMaster.com</title>
						<!-- LINK A HOJAS DE STILOS CSS -->
	<link rel="stylesheet" type="text/css" href="estiloscss/estilos.css"/>
</head>
<body>
 <header>
 <p>
    <div class="contenedor" >
      <h1>Bienvenido a TrackMaster.com</h1>
    </div>
  </p> 
  </header>
  	<form id="FormloginAdministrativo" method = 'POST' action="LoginAdministrativoServlet" >
	<br>
	</br>
	<br>
	</br>
	<h2>Inicio de sesión administrativo... </h2>
		<main>
			<fieldset>
			<table>
				<td>Ingresa tu usuario y contraseña:</td>
				<tr> 
    				<td>Usuario:</td>
					<td><input type="text" name="usuariousuarioAdministrativo" id="usuarioAdministrativo" placeholder="Ingrese usuario" required="required"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="passwordusuarioAdministrativo" id="passwordusuarioAdministrativo" placeholder="Ingrese password" required="required"></td>
				</tr>
	
				<tr>
					<TD><input type="button" value="Cancelar" >
					<input type="submit" value="Aceptar" id=LoginUsuariousuarioAdministrativo></TD>
				</tr>
				<tr>
				</tr>
			</table>
			</fieldset>
		</main>
	</form>
</body>
</html>