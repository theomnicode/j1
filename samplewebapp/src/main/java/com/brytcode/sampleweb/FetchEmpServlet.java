package com.brytcode.sampleweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.brytcode.sampleweb.model.Employee;
import com.brytcode.sampleweb.repo.EmployeeRepoImpl;
import com.brytcode.sampleweb.repo.PostGresEmployeeRepoImpl;

public class FetchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		HttpSession session = request.getSession();
		String uuid = session.getAttribute("EUUID").toString();
		PostGresEmployeeRepoImpl empRepo = new PostGresEmployeeRepoImpl();
		PrintWriter out = response.getWriter();
		try {
			Employee emp = empRepo.getEmployee(uuid);
			out.write(emp.toString());
		} catch (SQLException e) {		
			e.printStackTrace();
			out.write(String.format("<html><body><h2>Can not fetch the employee</h2></body></html>"));	
		} 
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
