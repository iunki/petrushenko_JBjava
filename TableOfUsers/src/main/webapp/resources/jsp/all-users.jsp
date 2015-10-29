<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=windows-1251" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Table</h1>


<table cellpadding="8" border="1" >
    <tr bgcolor="#f5f5dc">
        <td>Name</td>
        <td>Surname</td>
        <td>Patronymic</td>
        <td>Birthday</td>
        <td>Gender</td>
    </tr>


    <core:forEach var="user" items="${users}">
        <tr>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.patronymic}</td>
            <td>${user.date}</td>
            <td>${user.gender}</td>
        </tr>
    </core:forEach>

</table>
</body>
</html>