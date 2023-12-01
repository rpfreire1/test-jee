
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Listado de Vehiculos</title>
</head>
<body>
<h1>Listado de Vehiculos</h1>
<ul>
    <c:forEach items="${vehicleRegistries}" var="vehicleRegistry">
        <li>${vehicleRegistry.purchasedDate} ${vehicleRegistry.comments} </li>
    </c:forEach>
</ul>
</body>
</html>
