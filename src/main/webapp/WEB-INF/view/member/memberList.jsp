<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
    <h1>회원 목록 조회</h1>
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
        <c:forEach items="${ requestScope.memberList }" var="member">
            <tr>
                <td>${ member.memberCode }</td>
                <td>${ member.name }</td>
                <td>${ member.birthDay }</td>
                <td>${ member.gender }</td>
                <td>${ member.detail }</td>
                <td>${ member.contact }</td>
                <td>
                    <c:choose>
                        <c:when test="${ member.teamCode == 1 }">
                            내담자
                        </c:when>
                        <c:when test="${ member.teamCode == 2 }">
                            아동 상담자
                        </c:when>
                        <c:when test="${ member.teamCode == 3 }">
                            청소년 상담자
                        </c:when>
                        <c:when test="${ member.teamCode == 4 }">
                            노인 상담자
                        </c:when>
                        <c:when test="${ member.teamCode == 5 }">
                            부부 상담자
                        </c:when>
                        <c:when test="${ member.teamCode == 6 }">
                            가족 상담자
                        </c:when>
                        <c:when test="${ member.teamCode == 7 }">
                            죽동 상담자
                        </c:when>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${ member.activeStatus == 'Y' }">
                            사용 중
                        </c:when>
                        <c:when test="${ member.activeStatus == 'N' }">
                            탈퇴
                        </c:when>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
