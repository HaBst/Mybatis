package org.kh.user.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.user.model.vo.User;
import org.kh.user.service.UserServiceImpl;

/**
 * Servlet implementation class MybatisTest6Servlet
 */
@WebServlet(name = "MybatisTest6", urlPatterns = { "/mybatisTest6" })
public class MybatisTest6Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisTest6Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<User>list = new UserServiceImpl().selectAllUser();
		
		
		if(!list.isEmpty()) {
			RequestDispatcher view = request.getRequestDispatcher("/views/user/userList.jsp");
			request.setAttribute("list", list);
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
