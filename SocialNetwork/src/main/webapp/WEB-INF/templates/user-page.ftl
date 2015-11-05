<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<link rel="stylesheet" type="text/css" href="/resources/css/user-page.css"/>
<link rel="stylesheet" type="text/css" href="/resources/css/tweet-list.css"/>
<#--<@security.authentication property="principal.username" var="username"/>-->
<script> var currUsername = "${currUsername}";
function f() {
    return currUsername;
}
</script>

<#include "main-template.ftl"/>
<#macro m_body>
<div id="root">
    <div id="user-profile" class="col-lg-6 col-lg-offset-3">
        <img id="avatar" src="/resources/images/ava.jpg" alt="avatar" class="img-thumbnail" align="left">

        <h3>
        ${surname} ${firstname}
            <#if lastname??>
            ${lastname}
            </#if>
            <small>@${currUsername}</small>
        </h3>
        <br>
        <h4>
            <#if city??>
                <em>${city}</em>
            </#if>
            <br>
            <br>
            <#if bDay??>
                <em>${bDay}</em>
            </#if>
        </h4>
    </div>
    <div id="posts">
        <div class="col-lg-6 col-lg-offset-3" id="send-field">
            <strong>Опубликовать:</strong>
            <textarea id="js-tweet-text" class="form-control" rows="3" title="tweet"></textarea>
            <button type="submit" id="js-sendtweet" class="btn btn-info">Отправить!</button>
        </div>
        <div id="js-tweets" class="col-lg-6 col-lg-offset-3">

        </div>
    </div>
</div>
</#macro>
<@main title="${firstname} ${surname}" customScripts = ["/resources/js/tweet.js"] />