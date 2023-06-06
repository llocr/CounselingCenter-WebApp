package com.management.team.model.dao;

import com.common.search.SearchValue;
import com.management.team.model.dto.TeamDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface TeamDAO {
    List<TeamDTO> selectAllTeam(SqlSession sqlSession);

    List<TeamDTO> selectSortTeam(SqlSession sqlSession);

    int insertTeam(TeamDTO team);

    int updateTeam(TeamDTO team);

    int deleteTeam(SearchValue codeValue);
}
