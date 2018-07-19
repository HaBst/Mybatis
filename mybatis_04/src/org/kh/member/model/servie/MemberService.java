package org.kh.member.model.servie;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.common.SqlSessionTemplate;
import org.kh.member.model.dao.MemberDAO;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;

public class MemberService {

	public Member selectOne(Member m) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		
		Member m2 = new MemberDAO().selectOne(session,m);
		return m2;
	}

	public int insertMember(Member m) {
		SqlSession session  = SqlSessionTemplate.getSqlSession();
		
		int result = new MemberDAO().insertMember(session,m);
		
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	public int updateMember(Member m) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		
		int result = new MemberDAO().updateMember(session,m);
		
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	public int deleteMember(String memberId) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		
		int result = new MemberDAO().deleteMember(session,memberId);
		
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
		
	}

	public ArrayList<Member> allMember() {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		
		ArrayList<Member>list = new MemberDAO().allMember(session);
		
		return list;
		
	}

	public ArrayList<Member> searchUserList(Search search) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		
		ArrayList<Member>list = new MemberDAO().searchUserList(session,search);
		return list;
	}

	public ArrayList<Member> searchCateList(String[] addr) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		
		ArrayList<Member>list = new MemberDAO().searchCateList(session,addr);
		return list;
	}

}
