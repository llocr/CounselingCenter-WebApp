package com.management.member.controller;

import com.management.member.model.dto.MemberDTO;
import com.management.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/member/update")
public class UpdateMemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String memberCode = request.getParameter("memberCode");
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birth").replace("-","");
        String gender = request.getParameter("gender");
        String detail = request.getParameter("detail");
        String contact = request.getParameter("contact").replace("-","");
        String teamCode = request.getParameter("teamCode");
        String activeStatus = request.getParameter("activeStatus");

        MemberService memberService = new MemberService();
        MemberDTO member = new MemberDTO();

        member.setMemberCode(memberCode);
        member.setName(name);
        member.setBirthDay(birthDay);
        member.setGender(gender);
        member.setDetail(detail);
        member.setContact(contact);
        member.setTeamCode(teamCode);
        member.setActiveStatus(activeStatus);

        int result = memberService.updateMember(member);

        String path = "";

        if(result > 0) {
            path = "/WEB-INF/view/common/successPage.jsp";
            request.setAttribute("successCode", "updateMember");
            request.setAttribute("name", member.getName());
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("message", "기존 회원 정보 수정 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }
}
