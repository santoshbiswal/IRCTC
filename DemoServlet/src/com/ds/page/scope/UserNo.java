package com.ds.page.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserNo extends HttpServlet {
	int x = 0;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body bgcolor='cyan'>");
		out.println("<h1>" + x + "</h1>");
		x++;
		out.println("</body>");
		out.println("</html>");
	}

}
