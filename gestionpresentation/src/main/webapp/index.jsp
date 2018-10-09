<html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
<link href="<c:url value = "/assets/css/home.css"/>" type="text/css" rel="stylesheet">
</head>
<body>
	
<div class="blog">
  <h1>Gestions des Ressouces des projets</h1>
  <div class="flex">
  
   <a href="staticResourceTest">
    <div class="flex-child">
	      <div class="post">
	        <div class="info">
	           <img src = "<c:url value = "/assets/imgs/recruitment.png"/>" />
	          <h3>Ressources</h3>         
	        </div>
	      </div>
	 </div>
   </a>

    <div class="flex-child">
      <div class="post">
        <div class="info">
          <img src = "<c:url value = "/assets/imgs/projects.png"/>" />
          <h3>Projets</h3>
        </div>
      </div>
    </div>
  </div>
</div>
<script  src="<c:url value = "/assets/js/jquery-3.3.1.js"/>"></script>
<script src="<c:url value = "/assets/js/home.js"/>"></script>
</body>
</html>