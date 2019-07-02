package com.ds.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		ServletContext sc = getServletContext();
		Integer x = (Integer) sc.getAttribute("ps1");
		Integer y = (Integer) sc.getAttribute("ps2");
		PrintWriter pw = resp.getWriter();
		pw.println("Addition :" + x + y);

		/*
		 * Cookie c[] = req.getCookies(); String s = null; for (int j = 0; j < c.length;
		 * j++) { s = c[j].getValue(); }
		 */
	}

}
