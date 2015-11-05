<#list tweets as tweet>

<div class="tweet-top">
${tweet.author.firstname} ${tweet.author.surname}
</div>
<div class="tweet-bottom">
    <div> ${tweet.text}</div>
    <div align="right"><small><em>${tweet.date}</em></small></div>
</div>
</#list>