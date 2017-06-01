<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix = "spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contacts</title>
        <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="stylesheet" href="${urlCss}" type="text/css" />
    </head>
    <body>
        <form:form method="POST" modelAttribute="equation">
            <form:select path="difficulty">
                <form:options items="${difficulties}" />
            </form:select>
            <form:select path="operator">
                <form:options items="${operators}" />
            </form:select>
            <input type="submit" value="Generate" />
        </form:form>
    </body>
</html>