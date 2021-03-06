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
 * Servlet implementation class MybatisTest1Servlet
 */
@WebServlet(name = "MybatisTest1", urlPatterns = { "/mybatisTest1" })
public class MybatisTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisTest1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		
		User u = new UserServiceImpl().selectUser(userId);
		
		response.setContentType("text/html; charset = utf-8");
		if(u != null) {
			response.getWriter().println("사용 가능합니다.");
		}else {
			response.getWriter().println("사용 불가능 합니다.");
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
