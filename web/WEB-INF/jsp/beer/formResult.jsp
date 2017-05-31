<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection</title>
    </head>
    <body>
        <p>Got beer color ${beer.color}</p>
        <p>
            Try:
            <ul>
                <c:forEach items="${suggestions}" var="suggestion">
                    <li>${suggestion}</li>
                </c:forEach>
            </ul>
        </p>
    </body>
</html>