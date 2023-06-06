<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
    <h1> 에러 코드 : <% request.getAttribute("statusCode");%> </h1>
    <h2> 에러 메시지 : <% request.getAttribute("message");%> </h2>
</body>
</html>
