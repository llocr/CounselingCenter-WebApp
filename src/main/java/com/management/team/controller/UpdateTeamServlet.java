package com.management.team.controller;

import com.management.team.model.dto.TeamDTO;
import com.management.team.model.service.TeamService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/team/update")
public class UpdateTeamServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String teamCode = request.getParameter("teamCode");
        String name = request.getParameter("name");
        String detail = request.getParameter("detail");
        String use = request.getParameter("use");

        TeamService teamService = new TeamService();
        TeamDTO team = new TeamDTO();

        team.setTeamCode(teamCode);
        team.setName(name);
        team.setDetail(detail);
        team.setUse(use);

        int result = teamService.updateTeam(team);

        String path = "";

        if(result > 0) {
            path = "/WEB-INF/view/common/successPage.jsp";
            request.setAttribute("successCode", "updateTeam");
            request.setAttribute("name", team.getName());
        } else {
            path = "/WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("message", "기존 팀 정보 수정 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }
}
