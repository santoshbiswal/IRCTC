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

public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		int n2 = 20;
		HttpSession ses = req.getSession();
		ses.setAttribute("ps2", "n2");
		
		/*Cookie c1 = new Cookie("pname", "n2");
		resp.addCookie(c1);*/

		ServletContext con = req.getServletContext();
		RequestDispatcher rd = con.getRequestDispatcher("/servlet3");
		rd.forward(req, resp);
	}

}
