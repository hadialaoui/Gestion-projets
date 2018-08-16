<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Employee</title>
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
    <div class="card-header text-center">Modification Projet</div>  
    <div class="card-body">
       <form action="/gestionpresentation/listEmployee/put/${employee.id}" method="post">
        <div class="row">
        <div class="offset-lg-2 col-lg-8">
         <div class="form-group">
          <label class="control-label">Refog</label>
          <input type="text" name="refog" value="${employee.refog}" class="form-control"/>
          <span></span>
        </div>
        <div class="form-group">
          <label class="control-label">Nom</label>
          <input type="text" name="nom" value="${employee.nom}" class="form-control"/>
          <span></span>
        </div>
        
        <div class="form-group">
          <label class="control-label">Prenom</label>
          <input type="text" name="prenom" value="${employee.prenom}" class="form-control"/>
          <span></span>
        </div>
               
         <div class="form-group">
          <label class="control-label">Statut</label>
          <input type="text" name="statut" value="${employee.statut}" class="form-control"/>
          <span></span>
        </div>
        
        <%--  <div class="form-group">
          <label class="control-label">Date Integration</label>
          <input type="text" name="dateIntegration" value="${employee.dateIntegration}" class="form-control"/>
          <span></span>
        </div> --%>
        
        <div>
          <button type="submit" class="btn btn-primary">Enregister</button>
        </div>
        </div>
        </div>
	</form> 
	
    </div>
</div>

	</div>
	<script  src="<c:url value = "/assets/js/jquery-3.3.1.js"/>"></script>
</body>
</html>