<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1> Lista de Libros Disponibles </h1>

		<table class="table table-striped table-bordered table-hover"> 
			<thead>
				<tr>
					<th>Titulo</th>
					<th>ISBN</th>
					<th>FechaEdicion</th>
					<th>Autor</th>
					<th>Editorial</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${BLibro}" var="dato">
					<tr>
						<td>${dato.titulo}</td>
						<td>${dato.ISBN}</td>
						<td>${dato.fechaEdicion}</td>
						<td>${dato.autor}</td>
						<td>${dato.editorial}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
</body>
</html>