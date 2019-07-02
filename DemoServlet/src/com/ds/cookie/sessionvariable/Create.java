package com.ds.cookie.sessionvariable;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Create extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("t1");
		// process to create session variavle
		HttpSession ses = req.getSession();
		ses.setAttribute("pn", s);
		// process of creating cookie
		Cookie c = new Cookie("pname", s);
		resp.addCookie(c);
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1 align='center'>your info </h1>");
		out.println("<h1> price of " + s + "is 500");
		out.println("<h2 ><a href='./buy'>Buy Now");
		out.println("</body></html>");
	}

}
