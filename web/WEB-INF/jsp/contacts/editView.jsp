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
        <form:form method="POST" modelAttribute="contact">
            <form:input type="hidden" path="id" />
            <table>
                <tr>
                    <td><strong>First name</strong></td>
                    <td><form:input path="firstName" /></td>
                    <td><form:errors path="firstName" cssClass="error" /></td>
                </tr>
                <tr>
                    <td><strong>Last name</strong></td>
                    <td><form:input path="lastName" /></td>
                    <td><form:errors path="lastName" cssClass="error" /></td>
                </tr>
                <tr>
                    <td><strong>Birthday</strong></td>
                    <td><form:input path="birthDay" /></td>
                    <td><form:errors path="birthDay" cssClass="error" /></td>
                </tr>
            </table>
            <input type="submit" value="Update" />
        </form:form>
    </body>
</html>