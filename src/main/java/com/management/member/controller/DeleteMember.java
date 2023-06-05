package com.management.member.controller;

import com.common.search.SearchValue;
import com.management.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/member/delete")
public class DeleteMember extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String memberCode = request.getParameter("memberCode");
        SearchValue codeValue = new SearchValue(memberCode);

        MemberService memberService = new MemberService();

        int result = memberService.deleteMember(codeValue);

        String path = "";

        if(result > 0) {
            path = "/WEB-INF/view/common/successPage.jsp";
            request.setAttribute("message", "기존 회원 삭제 성공");
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("message", "기존 회원 삭제 실패");
        }




    }
}
