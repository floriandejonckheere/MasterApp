<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection</title>
    </head>
    <body>
        <form:form method="POST" action="beer.htm" modelAttribute="beer">
            <label>Color:</label>
            <form:select path="color">
                <form:options items="${colors}" />
            </form:select>

            <input type="submit" value="Suggest" />
        </form:form>
    </body>
</html>