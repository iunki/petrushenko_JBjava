<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>summ</title>
</head>
<body>
<c:if test="${sum != null}">
    Summ: ${sum}
</c:if>
<c:if test="${sum == null}">
    Student not found!
</c:if>
</body>
</html>
