<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>Welcome</title>
<!-- <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet"> -->
<!-- <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<link href="css/custom.css" type="text/css" rel="stylesheet">
<link href="/css/custom.css" type="text/css" rel="stylesheet">
<link href="/static/css/custom.css" type="text/css" rel="stylesheet">
<link href="../static/css/custom.css" type="text/css" rel="stylesheet">
</head>
<body>
	<h2>${msg}</h2>
	<div class="container">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Refog</th>
					<th>Nom</th>
					<th>Pr�nom</th>
					<th>Statut</th>
					<th>Date integration</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employees}" var="employee">
					<tr>
						<td>${employee.refog}</td>
						<td>${employee.nom}</td>
						<td>${employee.prenom}</td>
						<td>${employee.statut}</td>
						<td>${employee.dateIntegration}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="js/custom.js"></script>
</body>
</html>