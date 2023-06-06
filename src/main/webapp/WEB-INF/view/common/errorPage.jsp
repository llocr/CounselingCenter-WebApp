<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String message = (String) request.getAttribute("message");
    %>

    <h2><%= message %></h2>

</body>
</html>
