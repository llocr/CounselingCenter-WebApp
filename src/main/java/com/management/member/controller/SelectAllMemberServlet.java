package com.management.member.controller;

import com.management.member.model.dto.MemberDTO;
import com.management.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/list")
public class SelectAllMemberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MemberService memberService = new MemberService();
        List<MemberDTO> memberList = memberService.selectAllMember();

        String path = "";

        if(memberList != null) {
            path = "/WEB-INF/view/member/memberList.jsp";
            request.setAttribute("memberList", memberList);
        } else {
            path = "/WEB-INF/common/errorPage.jsp";
            request.setAttribute("message", "전체 회원 목록 조회 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
