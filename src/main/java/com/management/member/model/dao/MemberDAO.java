package com.management.member.model.dao;

import com.common.search.SearchValue;
import com.management.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface MemberDAO {
    List<MemberDTO> selectAllMember(SqlSession sqlSession);

    List<MemberDTO> selectTeamMember(SearchValue teamValue);

    MemberDTO selectMemberByCode(SearchValue codeValue);

    int insertMember(MemberDTO member);
}
