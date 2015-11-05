<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>average</title>
</head>
<body>
<c:if test="${average != null}">
    Average: ${average}
</c:if>
<c:if test="${average == null}">
    Student not found!
</c:if>
</body>
</html>
