<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>
</title>
</head>
<body>
 <header>
 <p>
    <div class="contenedor" >
      <h1>Bienvenido a TrackMaster.com</h1>
    </div>
  </p> 
  </header>
  <!-- INICIO DE DEFINICION DE ESTILOS DE LA PÁGINA -->
   <style type="text/css">
  		header {
  	 			width: 100%;  
  				height: 70px;
  				position: fixed;
  				top:0;
  				left:0;
  				background: #333;
  				color:#fff;
 			    }
   </style>
  <form id="FormAltaUsuario" method = 'POST' action="FormularioAltaServlet" >
  <br>
	</br>
	<br>
	</br>
	<h2>Por favor ingrsa tus datos para operar con Trackmasters</h2>
		<fieldset>
		<table>
			<tr>
				<td>Ingrese nombre</td>
				<td><input type="text" name="NombreUsuario"  id="NombreUsuario" placeholder="Ingrese usuario" required="required"></td>
			</tr>
			<tr>
				<td>Ingrese Apellido</td>
				<td><input type="text" name="ApellidoUsuario" id="ApellidoUsuario" placeholder="Ingrese Apellido" required="required"></td>
			</tr>
				<tr>
				<td>Ingrese email</td>
				<td><input type="text" name="EmailUsuario" id="EmailUsuario" placeholder="Ingrese Email" required="required"></td>
			</tr>
		
				<!-- <td>Ingrese estado de cuenta</td> -->
				<td>
					<input type="hidden" value="activo" name="EstadoCuentaUsuario" >
				</td>
	
			<tr>
				<td>Ingrese dirección de envío</td>
				<td><input type="text" name="DireccionEnvioUsuario" id="DireccionEnvioUsuario" placeholder="Ingrese Dirección" required="required"></td>
			</tr>
			<tr>
				<td>Ingrese contraseña de usuario</td>
				<td><input type="text" name="ContraseñaUsuario" id="ContraseñaUsuario" placeholder="Ingrese Contraseña" required="required"></td>
			</tr>
			<tr>
				<td><input type="submit" name="RegistrarUsuario" value="Registrar" id="RegistrarUsuario" ></td>
			</tr>
		</table>
		</fieldset>
  </form>
</body>
</html>