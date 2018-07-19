package org.kh.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "MybatisTest4", urlPatterns = { "/mybatisTest4" })
public class MybatisTest4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisTest4Servlet() {
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
		
		User u2 = new UserServiceImpl().selectOneUser(u);
		
		if(u2 != null) {
			RequestDispatcher view = request.getRequestDispatcher("views/user/userUpdate.jsp");
			request.setAttribute("user", u2);
			view.forward(request, response);
		}else {
			response.getWriter().println("실패하였습니다.");
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
