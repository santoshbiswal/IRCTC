package com.ds.application.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		Integer x = null;
		x = (Integer) sc.getAttribute("hit1");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		if (x == null) {
			x = 1;
		} else {
			x++;
		}
		sc.setAttribute("hit1", x);
		out.println("<h3><a href='./u'>Hit count</a></h3>");
		out.println("</html></body>");

	}
}
