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
            <thead>
                <td>First name</td>
                <td>Last name</td>
                <td>Birthday</td>
            </thead>
            <tbody>
                <c:forEach items="${contacts}" var="contact" varStatus="status">
                    <tr>
                        <td>${contact.id}</td>
                        <td><a href="contacts/${contact.id}">${contact.firstName}</a></td>
                        <td>${contact.lastName}</td>
                        <td>${contact.birthDay}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>