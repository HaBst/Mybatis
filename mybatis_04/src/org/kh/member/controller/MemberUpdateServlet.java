package org.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kh.member.model.servie.MemberService;
import org.kh.member.model.vo.Member;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet(name = "MemberUpdate", urlPatterns = { "/memberUpdate" })
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		String password = request.getParameter("password");
		String passwordRe = request.getParameter("passwordRe");
		
		if(password.equals(passwordRe)) {
		
		Member m = new Member();
		m.setMemberId(((Member)session.getAttribute("session")).getMemberId());
		m.setMemberPw(password);
		
		int result = new MemberService().updateMember(m);
			if(result > 0) {
				response.sendRedirect("/views/member/updateSuccess.jsp");
			}else {
				response.sendRedirect("/views/member/updateError.jsp");
			}
		
		}else {
			response.sendRedirect("/views/member/updateError.jsp");
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
