package com.ds.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		int n1 = 10;
		HttpSession ses = req.getSession();
		ses.setAttribute("ps1", "n1");

		/*Cookie c = new Cookie("p_name", "n1");
		resp.addCookie(c);*/
		
		ServletContext con = req.getServletContext();
		RequestDispatcher rd = con.getRequestDispatcher("/servlet2");
		rd.forward(req, resp);
	}

}
