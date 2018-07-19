package org.kh.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;

public class MemberDAO {

	public Member selectOne(SqlSession session, Member m) {
		Member m2  = session.selectOne("member.checkId", m);
		
		return m2;
	}

	public int insertMember(SqlSession session, Member m) {
		int result = session.insert("member.insert",m);
		
		return result;
	}

	public int updateMember(SqlSession session, Member m) {
		int result = session.update("member.update",m);
		return result;
	}

	public int deleteMember(SqlSession session, String memberId) {
		int result = session.delete("member.delete",memberId);
		return result;
	}

	public ArrayList<Member> allMember(SqlSession session) {
		List list = session.selectList("member.selectAll");
		return (ArrayList<Member>)list;
		
	}

	public ArrayList<Member> searchUserList(SqlSession session, Search search) {
		List list = session.selectList("member.searchList",search);
		return (ArrayList<Member>)list;
	}

	public ArrayList<Member> searchCateList(SqlSession session, String[] addr) {
		List list = session.selectList("member.searchCateList",addr);
		return (ArrayList<Member>)list;
	}

}
