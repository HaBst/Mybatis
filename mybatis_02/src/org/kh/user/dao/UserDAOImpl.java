package org.kh.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.user.model.vo.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public User selectUser(SqlSession session, String userId) {
		User u = session.selectOne("users.test1", userId);
		return u;
	}

	@Override
	public int insertUser(SqlSession session, User u) {
		int result = session.insert("users.test3",u);
		return result;
	}

	@Override
	public User selectOneUser(SqlSession session, User u) {
		User u2 = session.selectOne("users.test2",u);
		return u2;
	}

	@Override
	public int updateUser(SqlSession session, User u) {
		int result = session.update("users.test4",u);
		return result;
	}

	@Override
	public int deleteUser(SqlSession session, User u) {
		int result = session.delete("users.test5",u);
		return result;
	}

	@Override
	public ArrayList<User> selectAllUser(SqlSession session) {
		List list = session.selectList("users.test6");
		return (ArrayList<User>)list;
	}



}
