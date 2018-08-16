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
		<table class="table table-striped table-bordered table-list">
			<thead class="thead-dark">
				<tr>
					<th>nom</th>
					<th>Date Debut</th>
					<th>date Fin</th>
					<th>refogRespo</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${projets}" var="projet">
					<tr>
						<td>${projet.nom}</td>
						<td>${projet.dateDebut}</td>
						<td>${projet.dateFin}</td>
						<td>${projet.refogRespo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form action="/gestionpresentation/affectationProjet/${idEmployee}" method="post" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" name="idProjet" type="text" placeholder="identifiant projet" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Affectation</button>
    </form>
	</div>
	<script  src="<c:url value = "/assets/js/jquery-3.3.1.js"/>"></script>
</body>
</html>