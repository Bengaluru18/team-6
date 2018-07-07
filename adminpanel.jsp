<%-- 
    Document   : adminpanel
    Created on : Jul 7, 2018, 4:55:39 PM
    Author     : Prashanth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if(session.getAttribute("username")==null)
    {
        response.sendRedirect("adminlogin.jsp");
    }
 %>
        <h1>Hello World!</h1>
    </body>
</html>
