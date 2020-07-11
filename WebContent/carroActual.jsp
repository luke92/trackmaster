<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <c:if test="${empty carro}">
	<c:redirect url="index.jsp"/>
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="/includes/sesionCliente.jsp"></jsp:include>
<html>
<head>
<jsp:include page="/includes/Head.jsp"></jsp:include>
<title>Comprando</title>
</head>
<body>
<jsp:include page="/includes/header.jsp"></jsp:include>

<br>
	</br>
	<br>
	</br>

 	<fieldset>
	<table>
		<td>Usted está logueado como: ${carro.usuario.nombre} ${carro.usuario.apellido}</td>
		<TD><a href="LogOutServlet">Logout</a></TD>
	</table>
	</fieldset>
	
	<!-- RECUADRO FIELDSET -->	
	<fieldset>
		
		<table width="100%" height="250px" cellspacing="1px" border="1px">
   		<!-- PRIMERA FILA-->
   		<tr height="50px">
      		<td colspan="2px">
         	<table title="Banner" border="0">
            <tr>
            	<div align="center"><IMG SRC=" http://silverstallionagency.com/wp-content/uploads/2013/08/Banner-como-comprarMS33.png" width="100%" height="200px"></div>
            </tr>
         	</table>
      		</td>
   		</tr>
   		<!-- PANEL IZQUIERDO -->
   		<tr height="200px">
      		<td>
         	<table title="Menu" border="0" width="100px">
            	<tr><td>MENU</td></tr>
            	<tr><td><label>Categorías</label></td></tr>
            	<tr><td>
           	  	<select name= "CategoriasMostrar" >					
			    <option selected disabled>Seleccionar Categoría</option>
			    <c:forEach items="${categorias}" var="categoria">
			    	<option value = "${categoria.idCategoria}">${categoria.descripcion}</option>
			    </c:forEach>
			    </select>
			    </td></tr>
			    <tr><td></td></tr>
            	<tr><td><label>Tracking de productos</label></td></tr>
				<tr><td><label>Mi información</label></td></tr>
				<TD><a href="CarritoCompraServlet">Volver</a></TD>
         	</table>
      		</td>
      	 <!-- PANEL DERECHO -->
      	 
      		<td>
         	<table title="Contenido" border="0" width="400px">
            <tr>
               <td>
               	<!-- Cargar productos-->
               	<form id="FormCarritoActual" method = 'POST' action="ConfirmarProductosServlet" >
               	<c:if test="${not empty carro.detalle.productos.productos}">
               		<c:forEach items="${carro.detalle.productos.productos}" var="p">
               				<img src="${p.producto.urlImagen}" width="300"  height="200" alt="" />
               				<h2>${p.producto.precioUnitario}</h2>
               				<p>${p.producto.descripcion}</p>
               				<p>${p.producto.marca}</p>
               				<p>${p.producto.modelo}</p>
               				<input type="number" value="1" min="0" max="5" name="cantidad" />
               				<input type="hidden" name="idProducto" value="${p.producto.idProducto }" />		
               		</c:forEach>
               		<button type="submit">Confirmar productos</button>
               		</c:if>
               	</form>
			   </td>
            </tr>
            </table>
     	    </td>
  		</tr>
		</table>
	</fieldset>
</body>
<jsp:include page="/includes/footer.jsp"></jsp:include>
</html>