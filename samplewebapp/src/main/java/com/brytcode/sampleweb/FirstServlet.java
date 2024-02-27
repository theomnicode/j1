package com.brytcode.sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public FirstServlet() {
        super();
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String uname = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter out = response.getWriter();
		response.setContentType("application/xml");
		out.println("<html5><body><h2>Hello "+uname+"</h2></body></html5>");		
	}	
}
