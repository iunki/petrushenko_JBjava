<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=windows-1251" language="java" %>

<html>
<head>
</head>


<body>
<h2>Add new:</h2>

<b>Fields marked with * must be filled</b>
<br> <br>

<sf:form action="" method="post" modelAttribute="user">

    <table cellpadding="8">

        <tr>
            <td><sf:label path="name">Name*: </sf:label></td>
            <td><sf:input path="name"/></td>
            <td><sf:errors path="name"/></td>
        </tr>
        <tr>
            <td><sf:label path="surname">Surname*: </sf:label></td>
            <td><sf:input path="surname"/></td>
            <td><sf:errors path="surname"/></td>
        </tr>
        <tr>
            <td><sf:label path="patronymic">Patronymic*: </sf:label> </td>
            <td><sf:input path="patronymic"/> </td>
            <td><sf:errors path="patronymic"/></td>
        </tr>
        <tr>
            <td><sf:label path="date">Birthday: </sf:label></td>
            <td><sf:input placeholder="DD.MM.YYYY" path="date"/> </td>
            <td><sf:errors path="date"/></td>
        </tr>
        <tr>
            <td><sf:label path="gender">Gender: </sf:label> </td>
            <td><sf:input placeholder="male or female" path="gender"/> </td>
            <td><sf:errors path="gender"/> </td>
        </tr>


    </table>
    <br>
    <button type="submit">Startui!</button>
</sf:form>


</body>
</html>