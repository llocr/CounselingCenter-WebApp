<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
    <jsp:include page="WEB-INF/view/common/header.jsp"/>
    <h2>멤버 정보 조회 하기</h2>
    <jsp:include page="WEB-INF/view/member/memberMain.jsp"/>
    <br>
    <br>
    <h2>그룹 정보 조회하기</h2>
    <jsp:include page="WEB-INF/view/team/teamMain.jsp"/>
</body>
</html>