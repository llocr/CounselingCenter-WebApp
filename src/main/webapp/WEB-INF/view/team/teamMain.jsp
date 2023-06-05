<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>함께 상담센터</title>
</head>
<body>
  <h3>1. 모든 팀 정보 조회하기</h3>
  <button onclick="location.href='${pageContext.servletContext.contextPath}/team/list'">전체 정보 조회하기</button>

  <hr>

  <h3>2. 상담자가 가장 많이 포진한 팀 순서로 조회하기</h3>
  <button onclick="location.href='${pageContext.servletContext.contextPath}/team/manyList'">순서대로 정보 조회하기</button>
  <hr>
  <h3>3. 신규 팀 추가히기</h3>
  <form action="team/insert">
    팀 이름 : <input type="text" name="teamName"><br>
    소속 상세 정보 : <input type="text" name="teamDetail"><br>
    사용 여부
    <select name="useYN">
      <option value="Y">사용 중</option>
      <option value="N">비사용 중</option>
    </select><br>
    <button type="submit">팀 정보 등록하기</button>
  </form>
  <hr>
  <h3>4. 기존 팀 정보 수정하기</h3>
  <form action="team/regist">
    수정할 팀 코드를 입력해주세요 : <input type="text" name="teamCode"><br>
    수정할 정보를 입력해주세요
    팀 이름 : <input type="text" name="teamName"><br>
    팀 상세 정보 : <input type="text" name="teamDetail"><br>
    팀 사용 여부
    <select name="useYN">
      <option value="Y">사용 중</option>
      <option value="N">비사용 중</option>
    </select><br>
    <button type="submit">팀 정보 수정하기</button>
  </form>
  <hr>
  <h3>5. 기존 팀 정보 삭제하기</h3>
  <form action="team/delete">
    삭제할 팀 코드를 입력해주세요 : <input type="text" name="teamCode"><br>
    <button type="submit">팀 정보 삭제하기</button>
  </form>
</body>
</html>
