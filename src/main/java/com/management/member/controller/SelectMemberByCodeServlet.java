package com.management.member.controller;

import com.common.search.SearchValue;
import com.management.member.model.dto.MemberDTO;
import com.management.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/member/select")
public class SelectMemberByCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String memberCode = request.getParameter("memberCode");

        SearchValue codeValue = new SearchValue(memberCode);

        MemberService memberService = new MemberService();
        MemberDTO member = memberService.selectMemberByCode(codeValue);

        String path = "";

        if(member != null) {
            path = "/WEB-INF/view/member/memberInfo.jsp";
            request.setAttribute("member", member);
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("message", "회원 정보 조회 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
