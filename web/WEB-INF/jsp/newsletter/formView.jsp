<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Newsletter</title>
    </head>
    <body>
        <form:form method="POST" action="newsletter" modelAttribute="newsletter">
            <div>
                <form:checkbox path="subscribed" id="subscribed" />
                <label for="subscribed">Subscribe to newsletter</label>
            </div>
                
            <div>
                <form:checkboxes path="topics" items="${topics}" />
            </div>

            <div>
                <input type="submit" value="Update" />
            </div>
        </form:form>
    </body>
</html>
