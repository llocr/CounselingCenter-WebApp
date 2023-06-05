package com.management.team.controller;

import com.management.team.model.dto.TeamDTO;
import com.management.team.model.service.TeamService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/team/sortList")
public class SelectSortTeamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeamService teamService = new TeamService();
        List<TeamDTO> teamList = teamService.selectSortList();

        String path = "";

        if(teamList != null) {
            path = "/WEB-INF/view/team/teamList.jsp";
            request.setAttribute("teamList", teamList);
        } else {
            path = "WEB-INF/view/common/errorPage.jsp";
            request.setAttribute("message", "상담자가 많은 순서대로 팀 목록 조회 실패");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}
