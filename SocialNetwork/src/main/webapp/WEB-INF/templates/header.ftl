<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>

<@security.authorize access="hasAnyRole('ROLE_USER','ROLE_ADMIN')">
    <@security.authentication property="principal.username" var="username"/>
</@security.authorize>

<header>
    <div class="col-lg-3 col-lg-offset-8 userside">
    <#if username??>
    <#--<p>${username} <a href="/logout">Выйти</a></p>-->

    ${username}

        <a class="btn btn-default btn-md" href="/logout">
            <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> Выйти
        </a>

    <#else>
    <#--<p><a href="/registration">Зарегистрироваться</a> или <a href="/login">Войти</a></p>-->

        <div class="btn-group">
            <a class="btn btn-default btn-md" href="/registration">
                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Зарегистрироваться
            </a>
            <a class="btn btn-default btn-md" href="/login">
                <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span> Войти
            </a>
        </div>

    </#if>
    </div>
</header>