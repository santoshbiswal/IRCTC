package com.ds.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTrack extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// create a session object if session is not already created
		HttpSession session = req.getSession(true);
		// get session creation time
		Date creationTime = new Date(session.getCreationTime());
		// get last access time in this website
		Date lastAccess = new Date(session.getLastAccessedTime());
		//
		String title = "welcome back to my website";
		Integer visiteCount = new Integer(0);
		String visitCountKey = new String("visiteCount");
		String userID = new String("ABCD");
		String UserIdkey = new String("userId");
		// check this is new comer in ur web page
		if (session.isNew()) {
			title = "Welcome to my web page";
			session.setAttribute(UserIdkey, userID);
		} else {
			visiteCount = (Integer) session.getAttribute(visitCountKey);
			visiteCount = visiteCount + 1;
			userID = (String) session.getAttribute(UserIdkey);
		}
		session.setAttribute(visitCountKey, visiteCount);
		// set response content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println(" <h1>session info   value</h1>");
		out.println(" <h1>id -" + session.getId() + "</h1>");
		out.println("<h1>Creation Time " + creationTime + "</h1>");
		out.println("<h1>Time of Last Acces " + lastAccess + "</h1>");
		out.println(" <h1>id -" + session.getId() + "</h1>");
		out.println(" <h1>User ID -" + userID + "</h1>");
		out.println("<h1> Number of visits " + visiteCount + "</h1>");
		out.println("</html></body>");
	}
}
