<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>
    <h3>1. 전체 상담자 & 내담자 조회하기</h3>
    <button onclick="">전체 정보 조회하기</button>
    <br>
    <h3>2. 상담자 or 내담자 정보만 조회하기</h3>
    <form action="member/teamList">
        <select name="team">
            <option value="상담자">상담자</option>
            <option value="내담자">내담자</option>
        </select>
        <button type="submit">정보 조회하기</button>
    </form>
    <br>
    <h3>3. 고유 코드로 정보 조회하기</h3>
    <form action="member/select">
        조회할 번호를 입력하세요 :
        <input type="text" name="memberCode" id="memberCode">
        <button type="submit">정보 조회하기</button>
    </form>
    <br>
    <h3>4.신규 정보 등록하기</h3>
    <form action="member/insert">
        이름 : <input type="text" name="name"><br>
        생년월일(1999-01-14 형태) : <input type="text" name="birth"><br>
        성별 :
        <select name="gender">
            <option value="M">남자</option>
            <option value="F">여자</option>
        </select><br>
        상세 정보 : <input type="text" name="detail"><br>
        연락처(010-1234-5678 형태) : <input type="text" name="contact"><br>
        회원 분류<br>
        <label><input type="radio" name="teamCode" value="1">1. 내담자</label>
        <label><input type="radio" name="teamCode" value="2">2. 아동상담 상담자</label>
        <label><input type="radio" name="teamCode" value="3">3. 청소년상담 상담자</label>
        <label><input type="radio" name="teamCode" value="4">4. 노인상담 상담자</label>
        <label><input type="radio" name="teamCode" value="5">5. 부부상담 상담자</label>
        <label><input type="radio" name="teamCode" value="6">6. 가족상담 상담자</label>
        <label><input type="radio" name="teamCode" value="7">7. 중독상담 상담자</label><br>
        활동 상태 :
        <select name="activeStatus">
            <option value="Y">활동 중</option>
            <option value="N">탈퇴</option>
        </select><br>
        <button type="submit">정보 등록하기</button>
    </form>
</body>
</html>
