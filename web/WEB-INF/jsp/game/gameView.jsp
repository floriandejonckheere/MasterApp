<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix = "spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game</title>
        <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="stylesheet" href="${urlCss}" type="text/css" />
    </head>
    <body>
        <c:forEach items="${game.visited}" var="link" varStatus="status">
            ${status.count}.
            <c:if test="${link}">
                ${status.index == game.bomb ? "bomb" : "ok"}
            </c:if>
            <c:if test="${!link && !game.finished}">
                <a href="/BeerSelection/game/${status.index}">visit</a>
            </c:if>
            <c:if test="${!link && game.finished}">visit</c:if>
            <br />
        </c:forEach>
        <p>
            <c:if test="${game.finished && game.won}">
                You WON! <a href="/BeerSelection/game">Restart</a>
            </c:if>
            <c:if test="${game.finished && !game.won}">
                You LOST! <a href="/BeerSelection/game">Restart</a>
            </c:if>
        </p>
    </body>
</html>