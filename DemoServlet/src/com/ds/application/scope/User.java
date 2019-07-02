package com.ds.application.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		Integer x = (Integer) sc.getAttribute("hit1");
		sc.setAttribute("hit1", x);
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1> user visited "+x+" times </h1>");
		out.println("</html></body>");
	}

}
