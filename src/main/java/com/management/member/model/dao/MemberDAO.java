package com.management.member.model.dao;

import com.common.search.SearchValue;
import com.management.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface MemberDAO {
    List<MemberDTO> selectAllMember(SqlSession sqlSession);

    List<MemberDTO> selectTeamMember(SqlSession sqlSession, SearchValue teamValue);

    MemberDTO selectMemberByCode(SqlSession sqlSession, SearchValue codeValue);
}
