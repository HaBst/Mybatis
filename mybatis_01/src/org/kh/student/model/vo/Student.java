package org.kh.student.model.vo;

import java.sql.Date;

public class Student {
	private int studentNo;
	private String studentName;
	private String studentTel;
	private String studentEmail;
	private String studentAddr;
	private Date regDate;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentNo, String studentName, String studentTel, String studentEmail, String studentAddr,
			Date regDate) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentTel = studentTel;
		this.studentEmail = studentEmail;
		this.studentAddr = studentAddr;
		this.regDate = regDate;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentTel() {
		return studentTel;
	}
	public void setStudentTel(String studentTel) {
		this.studentTel = studentTel;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentAddr() {
		return studentAddr;
	}
	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}


/*
create table student(
	    student_no number primary key,
	    student_name varchar2(30) not null,
	    student_tel char(11) not null,
	    student_email varchar2(50),
	    student_addr varchar2(100),
	    reg_date date default sysdate
	);
*/