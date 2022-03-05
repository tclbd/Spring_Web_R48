
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Contact</h1>
        <form method="POST" action="/contactForm">
            Name<input type="text" name="name"/><br>
            Age<input type="text" name="age"/><br>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
