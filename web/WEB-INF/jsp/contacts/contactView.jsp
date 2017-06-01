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
        <table>
            <tr>
                <td><strong>First name</strong></td>
                <td>${contact.firstName}</td>
            </tr>
            <tr>
                <td><strong>Last name</strong></td>
                <td>${contact.lastName}</td>
            </tr>
            <tr>
                <td><strong>Birthday</strong></td>
                <td>${contact.birthDay}</td>
            </tr>
        </table>
        <a href="edit/${contact.id}">Update</a>
    </body>
</html>