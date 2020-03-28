<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<form action="ControlleurServlet" method="post">
<input type="text" name="nom">
<input type="submit" value="send">
</form>

<table>
<tr>
<th>id</th>
<th>nom</th>
<th>prix</th>
<tr>
<c:forEach items="${nomp}" var="p">


<tr>
<td>${p.id }</td>
<td>${p.nom }</td>
<td>${p.prix }</td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>