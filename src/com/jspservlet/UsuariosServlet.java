package com.jspservlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspservlet.vo.VOLogin;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/users/adminUsers.servlet")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuariosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Action :" + action);
		List<VOLogin> list = (List<VOLogin>) request.getSession().getAttribute("listUser");
		VOLogin vo = new VOLogin();
		vo.setLogin(request.getParameter("login"));
		vo.setPassword(request.getParameter("password"));
		vo.setAge(Integer.parseInt(request.getParameter("age")));
		vo.setFirstName(request.getParameter("first_name"));
		if (action.equals("save")) {
			list.add(vo);
		} else if (action.equals("update")) {
			for (VOLogin obj : list) {
				if (obj.getLogin().equals(vo.getLogin())) {
					obj.setPassword(vo.getPassword());
					obj.setAge(vo.getAge());
					obj.setFirstName(vo.getFirstName());

				}
			}
		} else if (action.equals("remove")) {
			for (VOLogin obj : list) {
				if (obj.getLogin().equals(vo.getLogin())) {					
					list.remove(obj);

				}
			}
		}
response.sendRedirect("users.jsp");
	}

}
