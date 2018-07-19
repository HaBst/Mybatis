package org.kh.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.user.model.vo.User;
import org.kh.user.service.UserServiceImpl;

/**
 * Servlet implementation class MybatisTest4Servlet
 */
@WebServlet(name = "MybatisTest3", urlPatterns = { "/mybatisTest3" })
public class MybatisTest3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisTest3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		User u = new User();
		u.setUserId(request.getParameter("userId"));
		u.setUserPwd(request.getParameter("userPwd"));
		u.setUserNick(request.getParameter("userNick"));
		u.setUserTel(request.getParameter("userTel"));
		
		int result = new UserServiceImpl().insertUser(u);
		
		response.setContentType("text/html; charset = utf-8");
		if(result > 0) {
			response.getWriter().println("회원가입 성공");
		}else {
			response.getWriter().println("회원가입 실패");
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
