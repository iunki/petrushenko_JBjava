<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#include "main-template.ftl"/>
<#macro m_body>

<div class="col-md-4 col-md-offset-4" xmlns="http://www.w3.org/1999/html">
    <@sf.form action="/registration" method="post" modelAttribute="userform">
        <div class="text-center">
            <strong>Регистрация</strong>
        </div>
        <div class="form-group">
            <label for="username">Логин</label>
            <@sf.input path="username" id="username" cssClass="form-control" placeholder="Логин"/>
            <@sf.errors path="username"/>
        </div>
        <div class="form-group">
            <label for="password">Пароль</label>
            <@sf.input path="password" id="password" cssClass="form-control" placeholder="Пароль"/>
            <@sf.errors path="password"/>
        </div>
        <div class="form-group">
            <label for="firstname">Имя</label>
            <@sf.input path="firstname" id="firstname" cssClass="form-control" placeholder="Имя"/>
            <@sf.errors path="firstname"/>
        </div>
        <div class="form-group">
            <label for="firstname">Фамилия</label>
            <@sf.input path="surname" id="surname" cssClass="form-control" placeholder="Фамилия"/>
            <@sf.errors path="surname"/>
        </div>
        <div class="form-group">
            <label for="lastname">Отчество</label>
            <@sf.input path="lastname" id="lastname" cssClass="form-control" placeholder="Отчество"/>
        </div>
        <div class="form-group">
            <label for="city">Город</label>
            <@sf.input path="city" id="city" cssClass="form-control" placeholder="Город"/>
        </div>
        <div class="form-group">
            <label for="bDay">Дата рождения</label>
            <@sf.input path="bDay" id="bDay" cssClass="form-control" placeholder="дд.мм.гггг"/>
            <@sf.errors path="bDay"/>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </@sf.form>
</div>

</#macro>
<@main title="Главная"/>