<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
  <h1>팀 목록 조회</h1>
  <table>
    <tr>
      <th>팀 코드</th>
      <th>팀 이름</th>
      <th>상세정보</th>
      <th>사용 상태</th>
    </tr>
    <c:forEach items="${ requestScope.teamList }" var="team">
      <tr>
        <td>${ team.teamCode }</td>
        <td>${ team.name }</td>
        <td>${ team.detail}</td>
        <td>${ team.use}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
