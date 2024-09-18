<%-- 
    Document   : sastraastra
    Created on : Sep 8, 2018, 3:56:02 PM
    Author     : Niraj Sangroula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for(int i = 1; i<= 10; i++){
        %>
        <div><%out.println(i + 1000);%></div>
        <%
            }
        %>
    </body>
</html>
