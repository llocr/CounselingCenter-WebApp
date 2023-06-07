<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
    <%
        String message = (String) request.getAttribute("message");
    %>

    <script>
        alert("다시 시도해 주세요");
    </script>

    <h1><%= message %></h1>

</body>
</html>
