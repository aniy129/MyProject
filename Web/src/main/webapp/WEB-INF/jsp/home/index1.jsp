<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="home.title"></spring:message> </title>
</head>
<body>
<spring:message code="language.select"></spring:message> :
<a href="?locale=zh_CN">中文</a> &nbsp;&nbsp;&nbsp;
<a href="?locale=en_US">English</a>
<h1>
    <spring:message code="nav.item.list.tickets"/>
</h1>
<h2>
    ${java}
</h2>
<spring:message code="language.current" ></spring:message>: ${pageContext.response.locale } <br/>
${str}
</body>
</html>
