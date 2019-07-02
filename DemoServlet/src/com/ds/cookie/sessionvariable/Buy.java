package com.ds.cookie.sessionvariable;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Buy extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Redding value from session
		HttpSession ses = req.getSession();
		String s1 = (String) ses.getAttribute("pn");
		// Reading value of cookies variable
		Cookie c[] = req.getCookies();
		String s = null;
		for (int i = 0; i < c.length; i++) {
			if (c[i].getName().equals("pname")) {
				s = c[i].getValue();
			}
		}
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1> your product " + s + " will be delevered  soon </h1>");
		out.println("</body></html>");

	}

}
