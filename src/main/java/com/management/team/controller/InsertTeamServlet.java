package com.management.team.controller;

import com.management.team.model.dto.TeamDTO;
import com.management.team.model.service.TeamService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/team/insert")
public class InsertTeamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String detail = request.getParameter("detail");
        String use = request.getParameter("use");

        TeamService teamService = new TeamService();

        TeamDTO team = new TeamDTO();

        team.setName(name);
        team.setDetail(detail);
        team.setUse(use);

        teamService.insertTeam(team);
    }
}
