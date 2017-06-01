<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix = "spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory</title>
        <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="stylesheet" href="${urlCss}" type="text/css" />
    </head>
    <body>
        <form:form method="POST" action="edit" modelAttribute="crease">
            <div>
                <label>Increase:</label>
                <form:input path="increase" /> %
                <form:errors path="increase" cssClass="error" />
            </div>
            
            <div>
                <label>Decrease</label>
                <form:input path="decrease" /> %
                <form:errors path="decrease" cssClass="error" />
            </div>
            
            <div>
                <input type="submit" value="Suggest" />
            </div>
        </form:form>
    </body>
</html>