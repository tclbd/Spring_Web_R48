<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${s}</h1><br>
        <img src="/resources/abc.jpg"/> <br>
        <a href="/about">About</a><br>
        
        <c:forEach var="item" items="${map.list}">
            <p>${item}</p>
        </c:forEach>
    </body>
</html>
