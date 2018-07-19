package org.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.servie.MemberService;
import org.kh.member.model.vo.Member;

/**
 * Servlet implementation class SearchCategoryServlet
 */
@WebServlet(name = "SearchCategory", urlPatterns = { "/searchCategory" })
public class SearchCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCategoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String [] addr = request.getParameterValues("addr");
		
		ArrayList<Member>list = new MemberService().searchCateList(addr);
		
		//4. 결과 출력
		response.setContentType("text/html; charset=utf-8");
		if(!list.isEmpty()) {
			request.setAttribute("list", list);
			request.getRequestDispatcher("/views/member/checkList.jsp").forward(request, response);
		}else {
			response.getWriter().print("읽어오기 실패하였습니다.");
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
