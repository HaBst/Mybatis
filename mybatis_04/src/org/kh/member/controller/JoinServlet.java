package org.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.servie.MemberService;
import org.kh.member.model.vo.Member;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet(name = "Join", urlPatterns = { "/join" })
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String memberId = request.getParameter("userId");
		String memberPw = request.getParameter("userPwd");
		String memberPwRe = request.getParameter("userPwdRe");
		String memberName = request.getParameter("userName");
		String memberAddr = request.getParameter("userLocation");
		String memberGender = request.getParameter("gender");
		String[] Hobby = request.getParameterValues("hobby");
		//		String memberHobby = Arrays.toString(Hobby);

		System.out.println(memberId);
		System.out.println(memberPw);
		System.out.println(memberPwRe);
		System.out.println(memberName);
		System.out.println(memberAddr);
		System.out.println(memberGender);

		String memberHobby = "";

		if(Hobby != null) {
			for(int i = 0; i < Hobby.length; i++) {
				if(i == Hobby.length-1) {	
					memberHobby += Hobby[i];
				}else {
					memberHobby += Hobby[i]+",";
				}

			}
		}else {
			memberHobby += "없음";
		}
			System.out.println(memberHobby);
			
		if(memberPw.equals(memberPwRe)){
			System.out.println("비밀번호 같음");
			Member m = new Member();
			m.setMemberId(memberId);
			m.setMemberPw(memberPw);
			m.setMemberName(memberName);
			m.setMemberAddr(memberAddr);
			m.setGender(memberGender);
			m.setHobby(memberHobby);
			
			int result = new MemberService().insertMember(m);
			
			if(result > 0) {
				response.sendRedirect("/views/member/joinSuccess.jsp");
			}else {
				response.sendRedirect("/views/member/joinError.jsp");
			}
		}else {
			response.sendRedirect("/views/member/joinError.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
