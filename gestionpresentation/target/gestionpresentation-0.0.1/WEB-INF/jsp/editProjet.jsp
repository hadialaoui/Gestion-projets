<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Projet</title>
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
    <div class="card-header text-center">Modification Employee</div>  
    <div class="card-body">
       <form action="/gestionpresentation/projets/put/${projet.id}" method="post">
        <div class="row">
        <div class="offset-lg-2 col-lg-8">
         
        <div class="form-group">
          <label class="control-label">Nom</label>
          <input type="text" name="nom" value="${projet.nom}" class="form-control"/>
          <span></span>
        </div>
        <%-- 
        <div class="form-group">
          <label class="control-label">Date debut</label>
          <input type="text" name="dateDebut" value="${projet.dateDebut}" class="form-control"/>
          <span></span>
        </div>
               
         <div class="form-group">
          <label class="control-label">Date fin</label>
          <input type="text" name="dateFin" value="${projet.dateFin}" class="form-control"/>
          <span></span>
        </div> --%>
        
        <div class="form-group">
          <label class="control-label">refogRespo</label>
          <input type="text" name="refogRespo" value="${projet.refogRespo}" class="form-control"/>
          <span></span>
        </div>
               
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