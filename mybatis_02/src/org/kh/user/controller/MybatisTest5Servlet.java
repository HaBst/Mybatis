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
 * Servlet implementation class MybatisTest5Servlet
 */
@WebServlet(name = "MybatisTest5", urlPatterns = { "/mybatisTest5" })
public class MybatisTest5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisTest5Servlet() {
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
		
		int result = new UserServiceImpl().deleteUser(u);
		
		response.setContentType("text/html; charset = utf-8");
		if(result > 0) {
			response.getWriter().println("삭제 성공하였습니다.");
		}else {
			response.getWriter().println("삭제 실패하였습니다.");
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
