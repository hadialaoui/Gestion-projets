<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
<title>Welcome</title>
<link href="<c:url value = "/assets/css/bootstrap.min.css"/>" type="text/css" rel="stylesheet">
<link href="<c:url value = "/assets/css/bootstrap-reboot.min.css"/>" type="text/css" rel="stylesheet">
<link href="<c:url value = "/assets/css/bootstrap-grid.min.css"/>" type="text/css" rel="stylesheet">
<link href="<c:url value = "/assets/css/custom.css"/>" type="text/css" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
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
							href="/gestionpresentation/employees/${employee.id}/projets">
							<i class="material-icons" style="color:#358be1;">list</i>
							 Projets</a></td>
						
						<td><a
							href="/gestionpresentation/listEmployee/delete/${employee.id}" class="confirmation">
							<i class="material-icons" style="color:#358be1;">delete</i>
							</a></td>
						
						<td><a href="/gestionpresentation/updateEmployee/${employee.id}">
						<i class="material-icons" style="color:#358be1;">edit</i>
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script  src="<c:url value = "/assets/js/jquery-3.3.1.js"/>"></script>
	<script type="text/javascript">
							$('.confirmation').on('click', function() {
								return confirm('Etes vous surs de vouloir supprimer?');
							});
	</script>
</body>
</html>