<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>Welcome</title>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<h2>${msg}</h2>
<div>
<table class="table table-striped table-bordered table-list">
<tr>
  <th>Nom</th>
  <th>Prenom</th>
</tr>
<c:forEach items="${employees}" var="employee">
<tr>
   <td>${employee.nom}</td>
   <td>${employee.prenom}</td>
</tr>
</c:forEach>

</table>
</div>
	<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>