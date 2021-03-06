package com.xxq.servlet;

import com.google.gson.Gson;
import com.xxq.domain.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("this is init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogic(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleLogic(req, resp);
	}

	private void handleLogic(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("handle mylogic");
		ServletContext servletContext = getServletContext();
		RequestDispatcher rd = null;
		rd = servletContext.getRequestDispatcher("/index.jsp");// 定向的页面
		try {
//			rd.forward(request, response);
//			response.sendRedirect("/index.jsp");
			System.out.println("--------------------");
			User user = new User();
			user.setAge(11);
			user.setUsername("2222");
			Gson gson = new Gson();
			response.getWriter().write(gson.toJson(user));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
