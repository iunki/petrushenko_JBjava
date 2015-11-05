<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/getAvgSalaryInClinic">
    <label for="name"> Название клиники: </label>
    <input type="text" name="name" id="name" required>
    <input type="submit" value="get">
</form>
<div>1) Средняя з/п: <#if avgSalary??> ${avgSalary} </#if></div>
<hr>

<br>

<form action="/getStuffInfo">
    <label for="name"> Название клиники: </label>
    <input type="text" name="name" id="name" required>
    <label for="fio"> ФИО рабочего: </label>
    <input type="text" name="fio" id="fio" required>
    <input type="submit" value="get">
</form>
<div>1.1) Зарплата: <#if salary??> ${salary} </#if> <br>
    Работает: c <#if startTime??> ${startTime}> </#if>
<#if (endTime??) && (startTime??) > по ${endTime} </#if>
</div>
<hr>

<br>

<form action="/getAvgCheckByMedClinic">
    <label for="name"> Название клиники: </label>
    <input type="text" name="name" id="name" required>
    <input type="submit" value="get">
</form>
<div>2) Cредний чек в клинике: <#if avgMedCheck??> ${avgMedCheck} </#if></div>
<hr>

<br>

<form action="/getAvgCheckByOffice">
    <label for="name"> Название клиники: </label>
    <input type="text" name="name" id="name" required>
    <label for="city"> Город: </label>
    <input type="text" name="city" id="city" required>
    <label for="city"> Улица: </label>
    <input type="text" name="street" id="street" required>
    <input type="submit" value="get">
</form>

<div>2.1) Cредний чек в офисе по этому адресу: <#if avgMedAndOfficeCheck??> ${avgMedAndOfficeCheck} </#if></div>
<hr>

<br>

<#--<form action="/operationSupplier">
    <label for="name"> Название клиники: </label>
    <input type="text" name="name" id="name" required>
    <label for="city"> Город: </label>
    <input type="text" name="city" id="city" required>
    <label for="city"> Улица: </label>
    <input type="text" name="street" id="street" required>
    <label for="city"> Имя поставщика: </label>
    <input type="text" name="providerName" id="providerName" required>
    <input type="submit" value="get">
</form>
<div>3) Поставщик отправил оборудование: <#if send??> ${send} </#if></div>
<hr>

<br>

<div>
    4) Cамая прибыльная клиника: ${profitableMed}
    <br>
    Самый прибыльный офис: ${profitableOffice}
    <br>
    <a href="/mostProfitable" type="button">Узнать</a>
</div>-->
</body>
</html>
