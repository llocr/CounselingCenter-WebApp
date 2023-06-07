<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String successCode = (String) request.getAttribute("successCode");
    String name = (String) request.getAttribute("name");
%>

<h2 id="successMessage"></h2>
<h3 id="successInfo"></h3>
<script>
    let message;
    let option;
    let name = "<%= name %>";
    let successCode = "<%= successCode %>";
    switch (successCode) {
        case "insertMember" :
            message = "신규 회원 정보 등록에 성공하였습니다! :)";료
            option = "등록";
            name = name + "님 ";
            break;
        case "updateMember" :
            message = "기존 회원 정보 수정에 성공하였습니다! :)";
            option = "수정";
            break;
        case "deleteMember" :
            message = "기존 회원 정보 삭제에 성공하였습니다! :)";
            option = "삭제";
            name = name + "번 "
            break;
        case "insertTeam" :
            message = "신규 팀 정보 등록에 성공하였습니다! :)";
            option = "등록";
            name = name + "님 ";
            break;
        case "updateTeam" :
            message = "기존 팀 정보 수정에 성공하였습니다! :)";
            option = "수정";
            break;
        case "deleteTeam" :
            message = "기존 팀 정보 삭제에 성공하였습니다! :)";
            option = "삭제";
            name = name + "번 "
    }

    document.getElementById("successMessage").innerHTML = message;
    document.getElementById("successInfo").innerHTML = name + "정보를 " + option +"하였습니다.";
</script>

</body>
</html>
