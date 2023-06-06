<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
    <h3>1. 전체 상담자 & 내담자 조회하기</h3>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/member/list'">전체 정보 조회하기</button>

    <hr>

    <h3>2. 상담자 or 내담자 정보만 조회하기</h3>
    <form action="member/teamList">
      <select name="team">
        <option value="상담자">상담자</option>
        <option value="내담자">내담자</option>
      </select>
      <button type="submit">정보 조회하기</button>
    </form>

    <hr>

    <h3>3. 회원 코드로 회원 정보 조회하기</h3>
    <form action="member/select">
      조회할 번호를 입력하세요 :
      <input type="text" name="memberCode" id="memberCode">
      <button type="submit">정보 조회하기</button>
    </form>

    <hr>

    <h3>4.신규 회원 정보 등록하기</h3>
    <form action="${ pageContext.servletContext.contextPath }/member/insert" method="post">
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

        <button type="submit">회원 정보 등록하기</button>
    </form>

    <hr>

    <h3>5. 기존 회원 정보 수정하기</h3>
    <form action="${ pageContext.servletContext.contextPath }member/update" method="post">
      수정할 회원 코드 입력 : <input type="text" name="memberCode"><br>
      <h4>수정할 정보를 입력해주세요</h4>
      이름 : <input type="text" name="name"><br>
      생년월일(1999-01-14 형태) : <input type="text" name="birth"><br>
        성별 : <select name="gender">
            <option value="U">수정 안 함</option>
            <option value="M">남자</option>
            <option value="F">여자</option>
        </select><br>
      상세 정보 : <input type="text" name="detail"><br>
      연락처(010-1234-5678 형태) : <input type="text" name="contact"><br>
      회원 분류<br>
      <label><input type="radio" name="teamCode" value="0">0. 수정 안 함</label>
      <label><input type="radio" name="teamCode" value="1">1. 내담자</label>
      <label><input type="radio" name="teamCode" value="2">2. 아동상담 상담자</label>
      <label><input type="radio" name="teamCode" value="3">3. 청소년상담 상담자</label>
      <label><input type="radio" name="teamCode" value="4">4. 노인상담 상담자</label>
      <label><input type="radio" name="teamCode" value="5">5. 부부상담 상담자</label>
      <label><input type="radio" name="teamCode" value="6">6. 가족상담 상담자</label>
      <label><input type="radio" name="teamCode" value="7">7. 중독상담 상담자</label><br>
      활동 상태 :
      <select name="activeStatus">
        <option value="U">수정 안 함</option>
        <option value="Y">활동 중</option>
        <option value="N">탈퇴</option>
      </select><br>
      <button type="submit">회원 정보 수정하기</button>
    </form>

    <hr>

    <h3>6. 기존 회원 정보 삭제하기</h3>
    <form action="member/delete">
      삭제할 회원 코드 입력 : <input type="text" name="memberCode"><br>
      <button type="submit">회원 정보 삭제하기</button>
    </form>
</body>
</html>
