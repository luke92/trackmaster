<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${not empty carro}">
	<c:if test="${carro.usuario.rol == 'CLIENTE'}">
		<c:redirect url="Carrito.jsp"/>
	</c:if>
	<c:if test="${carro.usuario.rol == 'ADMINISTRATIVO'}">
		<c:redirect url="UsuarioAdministrativo.jsp"/>
	</c:if>
</c:if>
