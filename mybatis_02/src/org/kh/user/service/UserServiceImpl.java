package org.kh.user.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kh.user.dao.UserDAOImpl;
import org.kh.user.model.vo.User;

public class UserServiceImpl implements UserService{

	public SqlSession getSqlSession() {
		String resource = "/mybatis-config.xml";
		
		SqlSession session = null;
		
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			SqlSessionFactory factory = builder.build(is);
			
			session = factory.openSession(false);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return session;
	}
	
	@Override
	public User selectUser(String userId) {
		SqlSession session = getSqlSession();
		
		User u = new UserDAOImpl().selectUser(session,userId);
		return u;
	}

	@Override
	public int insertUser(User u) {
		SqlSession session = getSqlSession();
		
		int result = new UserDAOImpl().insertUser(session, u);
		
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	@Override
	public User selectOneUser(User u) {
		SqlSession session = getSqlSession();
		
		User u2 = new UserDAOImpl().selectOneUser(session, u);
		return u2;
	}

	@Override
	public int updateUser(User u) {
		SqlSession session = getSqlSession();
		
		int result = new UserDAOImpl().updateUser(session,u);
		
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	@Override
	public int deleteUser(User u) {
		SqlSession session = getSqlSession();
		
		int result = new UserDAOImpl().deleteUser(session,u);
		
		if(result >0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	@Override
	public ArrayList<User> selectAllUser() {
		SqlSession session = getSqlSession();
		
		ArrayList<User>list = new UserDAOImpl().selectAllUser(session);
		return list;
	}




}
