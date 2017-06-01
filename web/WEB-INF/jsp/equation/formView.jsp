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
        <form:form method="POST" action="/MasterApp/equation/validate" modelAttribute="equation">
            <form:input type="hidden" path="leftHand" />
            <form:input type="hidden" path="rightHand" />
            <form:input type="hidden" path="operator" />
            <form:input type="hidden" path="eqResult" />
            ${equation.leftHand} ${equation.operator} ${equation.rightHand} = <form:input path="userResult" />
            <form:errors path="userResult" cssClass="error" />
            ${equation.correct ? "CORRECTAMUNDO" : ""}

            <br />
            <input type="submit" value="Update" />
        </form:form>
    </body>
</html>