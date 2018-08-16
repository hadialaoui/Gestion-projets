<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
<title>Welcome</title>
<link href="<c:url value = "/assets/css/bootstrap.min.css"/>"
	type="text/css" rel="stylesheet">
<link href="<c:url value = "/assets/css/bootstrap-reboot.min.css"/>"
	type="text/css" rel="stylesheet">
<link href="<c:url value = "/assets/css/bootstrap-grid.min.css"/>"
	type="text/css" rel="stylesheet">
<link href="<c:url value = "/assets/css/custom.css"/>" type="text/css"
	rel="stylesheet">

</head>
<body>
	<%@include file="header.jsp"%>
	<br />
	<div class="container">
		<div class="row">
			<div class="offset-lg-2 col-lg-8">

				<div class="card ">
					<div class="card-header text-center">
						<div class="alert alert-success" role="alert">Projet
							${projet.nom} a été ajouté avec succes !</div>
					</div>
					<div class="card-body">

						<div class="form-group row">
							<label class="control-label col-lg-2">Nom : </label> <label
								class="control-label col-lg-4"><strong>${projet.nom}</strong></label>
						</div>
						<div class="form-group row">
							<label class="control-label col-lg-2">RefogRespo: </label> <label
								class="control-label col-lg-4"><strong>${projet.refogRespo}</strong></label>
						</div>

						<div class="form-group row">
							<label class="control-label col-lg-2">Date Debut:</label> <label
								class="control-label col-lg-5"><strong>${projet.dateDebut}</strong></label>
						</div>
						<div class="form-group row">
							<label class="control-label col-lg-2">Date Fin:</label> <label
								class="control-label col-lg-5"><strong>${projet.dateFin}</strong></label>
						</div>
					</div>
				</div>


			</div>
		</div>
	</div>
	<script src="<c:url value = "/assets/js/jquery-3.3.1.js"/>"></script>
</body>
</html>