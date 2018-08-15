<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>Welcome</title>
<link href="assets/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="assets/custom.css" type="text/css" rel="stylesheet">
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="container style-container">
		<br />
		<div>${employee.id}</div>
		<div>${employee.nom}</div>
		<table class="table table-striped table-bordered table-list">
			<thead class="thead-dark">
				<tr>
					<th>Refog</th>
					<th>Nom</th>
					<th>Prénom</th>
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
						<td><a
							href="listEmployee/delete/${employee.id}" class="confirmation">Delete</a></td>
						
						<td><a href="Edit.php?id=${produit.id}">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="assets/js/jquery-3.3.1.js"></script>
	<script type="text/javascript">
							$('.confirmation').on('click', function() {
								return confirm('Are you sure?');
							});
	</script>
</body>
</html>