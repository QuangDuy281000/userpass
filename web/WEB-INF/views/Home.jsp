<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/6/2021
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <th>Username</th>
        <th>Password</th>
    </tr>
    <c:forEach items="${listaccount}" var="l">
        <tr>
            <td>${l.username}</td>
            <td>${l.password}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
