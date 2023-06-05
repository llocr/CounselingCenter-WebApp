package com.management.team.model.service;

import com.management.team.model.dao.TeamDAO;
import com.management.team.model.dto.TeamDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.common.jdbc.JDBCTemplate.getSqlSession;

public class TeamService {

    private TeamDAO teamDAO;

    public List<TeamDTO> selectAllTeam() {
        SqlSession sqlSession = getSqlSession();
        teamDAO = sqlSession.getMapper(TeamDAO.class);

        List<TeamDTO> teamList = teamDAO.selectAllTeam(sqlSession);

        sqlSession.close();

        return teamList;
    }

    public List<TeamDTO> selectSortList() {
        SqlSession sqlSession = getSqlSession();
        teamDAO = sqlSession.getMapper(TeamDAO.class);

        List<TeamDTO> teamList = teamDAO.selectSortTeam(sqlSession);

        sqlSession.close();

        return teamList;
    }
}
