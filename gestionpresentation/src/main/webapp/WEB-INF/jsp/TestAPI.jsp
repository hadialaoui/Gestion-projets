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
		<div>${empUpdate.nom}</div>
		<div>${empUpdate.id}</div>
	</div>
</body>
</html>