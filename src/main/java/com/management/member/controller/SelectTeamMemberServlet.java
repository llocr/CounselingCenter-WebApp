package com.management.member.controller;

import com.common.search.SearchValue;
import com.management.member.model.dto.MemberDTO;
import com.management.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/teamList")
public class SelectTeamMemberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String team = request.getParameter("team");

        SearchValue teamValue = new SearchValue();
        teamValue.setValue(team);

        System.out.println(teamValue);

        MemberService memberService = new MemberService();
        List<MemberDTO> teamMember = memberService.selectTeamMember(teamValue);

        String path = "";

        if(teamMember != null) {
            path = "/WEB-INF/view/member/memberList.jsp";
            request.setAttribute("memberList", teamMember);
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("message", "회원 정보 조회 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
