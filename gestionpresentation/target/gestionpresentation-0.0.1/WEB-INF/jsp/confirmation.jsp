<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
	<br />
	<div class="container">
		<div class="row">
			<div class="offset-lg-2 col-lg-8">

				<div class="card ">
					<div class="card-header text-center">
						<div class="alert alert-success" role="alert">Employee ${employee.nom} a été ajouté avec succes !</div>
					</div>
					<div class="card-body">
						<div class="form-group row">
							<label class="control-label col-lg-3">Refog : </label> <label
								class="control-label col-lg-4"><strong>${employee.refog}</strong></label>
						</div>
						<div class="form-group row">
							<label class="control-label col-lg-3">Nom : </label> <label
								class="control-label col-lg-4"><strong>${employee.nom}</strong></label>
						</div>
						<div class="form-group row">
							<label class="control-label col-lg-3">Prenom : </label> <label
								class="control-label col-lg-4"><strong>${employee.prenom}</strong></label>
						</div>
						<div class="form-group row">
							<label class="control-label col-lg-3">Statut : </label> <label
								class="control-label col-lg-4"><strong>${employee.statut}</strong></label>
						</div>
						<div class="form-group row">
	        <label class="control-label col-lg-3">Date Integration:</label>
	        <label class="control-label col-lg-4"><strong>
	        <fmt:formatDate pattern="dd-MM-yyyy"
								value="${employee.dateIntegration}" />
	        <strong></label>
	      </div>
					</div>
				</div>


			</div>
		</div>
	</div>
	<script src="<c:url value = "/assets/js/jquery-3.3.1.js"/>"></script>
</body>
</html>