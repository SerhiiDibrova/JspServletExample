package com.jspservlet;


import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspservlet.vo.VOLogin;


/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		System.out.println("login :"+login);
		System.out.println("password :"+password);
		if(login.equals("Sergio") && password.equals("Rios")){
			
			System.out.println("welcome . . .");
			VOLogin vo = new VOLogin(); 
			vo.setLogin(login);
			vo.setPassword(password);
			vo.setAge(21);
			vo.setFirstName("Sergio JR");
			HttpSession session = request.getSession(true);
			List<VOLogin> list = new ArrayList<VOLogin>();			
			session.setAttribute("loginSigned", vo);
			session.setAttribute("listUser", list);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else{
			System.out.println("error . . .");
			response.sendRedirect("login.html");
		}
	}

}
