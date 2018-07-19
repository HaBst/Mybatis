package org.kh.user.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.user.model.vo.User;

public interface UserDAO {
	public User selectUser(SqlSession session,String userId);
	
	public User selectOneUser(SqlSession session,User u);
	
	public int insertUser(SqlSession session,User u);
	
	public int updateUser(SqlSession session,User u);
	
	public int deleteUser(SqlSession session,User u);
	
	public ArrayList<User> selectAllUser(SqlSession session);
}
