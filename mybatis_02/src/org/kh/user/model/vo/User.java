package org.kh.user.model.vo;

import java.sql.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userNick;
	private String userTel;
	private Date regDate;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String userPwd, String userNick, String userTel, Date regDate) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userNick = userNick;
		this.userTel = userTel;
		this.regDate = regDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
