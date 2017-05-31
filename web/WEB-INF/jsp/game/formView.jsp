<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix = "spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game</title>
        <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="stylesheet" href="${urlCss}" type="text/css" />
    </head>
    <body>
        <form:form method="POST" action="game" modelAttribute="game">
            <label>Number:</label>
            <form:input path="number" value="6" />
            <form:errors path="number" cssClass="error" />
            
            <div>
                <input type="submit" value="Suggest" />
            </div>
        </form:form>
    </body>
</html>