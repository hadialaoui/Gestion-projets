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

</head>
<body>
	<%@include file="header.jsp"%>
	<div class="container style-container">
		<br />
		 <div class="card">
		 <div class="card-header">
		    <h6>Ressource du projet : <strong>${projet.nom} </strong> </h6>
		 </div>
		 </div>
		<br/>
		<table class="table table-striped table-bordered table-list">
			<thead class="thead-dark">
				<tr>
					<th>Refog</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Date integration</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employees}" var="employee">
					<tr>
						<td>${employee.refog}</td>
						<td>${employee.nom}</td>
						<td>${employee.prenom}</td>
						<td>${employee.dateIntegration}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form action="/gestionpresentation/affectationProjet/${employee.id}" method="post" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" name="number" type="text" placeholder="identifiant projet" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Affectation</button>
    </form>
	</div>
	<script  src="<c:url value = "/assets/js/jquery-3.3.1.js"/>"></script>
</body>
</html>