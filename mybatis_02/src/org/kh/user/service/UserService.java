package org.kh.user.service;

import java.util.ArrayList;

import org.kh.user.model.vo.User;

public interface UserService {
	public User selectUser(String userId);
	
	public User selectOneUser(User u);
	
	public int insertUser(User u);
	
	public int updateUser(User u);
	
	public int deleteUser(User u);
	
	public ArrayList<User> selectAllUser();
}
