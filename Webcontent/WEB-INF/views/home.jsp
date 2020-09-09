<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="<c:url value="/resources/css/estilos.css"/>">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<spring:url value="/resources" var="urlPublic" />
</head>
<body>
	<div class="card">
		<div class="card-header">Lista de Personas</div>
		<div class="card-body">
			<table class="table table-striped table-bordered table-hover">
				<thead class="thead-dark">
					<tr>
						<th>ID-Desaparecido</th>
						<th>Nombres</th>
						<th>Apellidos</th>
						<th>DNI</th>
						<th>edad</th>
						<th>Fecha de Nacimiento</th>
						<th>Nacionalidad</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${Persona}" var="dato">
						<tr>
							<td>${dato.id_desaparecido}</td>
							<td>${dato.nombres}</td>
							<td>${dato.appelidos}</td>
							<td>${dato.dni}</td>
							<td>${dato.edad}</td>
							<td><fmt:formatDate value="${dato.fechaNacimiento}"
									pattern="dd-MM-YYY" /></td>
							<td>${dato.nacionalidad}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>