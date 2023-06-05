<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
    <h1>선택한 회원 조회</h1>
    <table>
        <tr>
            <th>회원 코드</th>
            <th>회원 이름</th>
            <th>생년월일</th>
            <th>성별</th>
            <th>상세정보</th>
            <th>연락처</th>
            <th>소속 그룹 코드</th>
            <th>활동 상태</th>
        </tr>
        <tr>
            <td>${ requestScope.member.memberCode }</td>
            <td>${ requestScope.member.name }</td>
            <td>${ requestScope.member.birthDay }</td>
            <td>${ requestScope.member.gender }</td>
            <td>${ requestScope.member.detail }</td>
            <td>${ requestScope.member.contact }</td>
            <td>${ requestScope.member.teamCode }</td>
            <td>${ requestScope.member.activeStatus }</td>
        </tr>
    </table>
</body>
</html>
