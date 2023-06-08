package com.management.team.controller;

import com.common.search.SearchValue;
import com.management.team.model.service.TeamService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/team/delete")
public class DeleteTeamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String teamCode = request.getParameter("teamCode");
        SearchValue codeValue = new SearchValue(teamCode);

        TeamService teamService = new TeamService();

        int result = teamService.deleteTeam(codeValue);

        String path = "";

        if(result > 0) {
            path = "/WEB-INF/view/common/successPage.jsp";
            request.setAttribute("successCode", "deleteTeam");
            request.setAttribute("name", teamCode);
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("message", "기존 팀 삭제 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }
}
