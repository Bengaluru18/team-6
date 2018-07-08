<%-- 
    Document   : ngopanel
    Created on : Jul 7, 2018, 5:11:57 PM
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
        response.sendRedirect("ngologin.jsp");
    }
 %>
        <h1>Hello NGO!</h1>
    </body>
</html>
