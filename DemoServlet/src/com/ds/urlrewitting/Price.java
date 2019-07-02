package com.ds.urlrewitting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Price extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String str = req.getParameter("t1");
		PrintWriter out = res.getWriter();
		out.println("price of " + str + " is 5000");
		out.println("<a href='./conform?x=" + str + "'>Buy now</a>");
		//out.println("<a href='./conform?x="+str+"'>Buy Now</a>");
		
	}
}