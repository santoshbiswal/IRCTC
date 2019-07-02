package com.ds.hiddenField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Price extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("t1");
		PrintWriter out = resp.getWriter();
		out.println("price of " + s + " is 300");
		out.println("<form action='./c'>");
		out.println("<input type='hidden' name='n1' value='" + s + "'>");
		out.println("<input type='submit' value='Buy Now'>");
		out.println("</form>");
	}

}
