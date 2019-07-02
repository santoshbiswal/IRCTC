package com.ds.hiddenField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Conform extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("n1");
		PrintWriter out = resp.getWriter();
		out.println("your product " + s + " will be delevered");
	}
}
