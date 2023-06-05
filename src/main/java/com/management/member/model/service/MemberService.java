package com.management.member.model.service;

import com.common.search.SearchValue;
import com.management.member.model.dao.MemberDAO;
import com.management.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.common.jdbc.JDBCTemplate.getSqlSession;

public class MemberService {
    private MemberDAO memberDAO;

    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> memberList = memberDAO.selectAllMember(sqlSession);

        sqlSession.close();

        return memberList;
    }

    public List<MemberDTO> selectTeamMember(SearchValue teamValue) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> memberList = memberDAO.selectTeamMember(teamValue);

        sqlSession.close();

        return memberList;
    }

    public MemberDTO selectMemberByCode(SearchValue codeValue) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        MemberDTO member = memberDAO.selectMemberByCode(codeValue);

        sqlSession.close();

        return member;
    }

    public int insertMember(MemberDTO member) {
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.insertMember(member);

        sqlSession.close();

        return result;
    }
}
