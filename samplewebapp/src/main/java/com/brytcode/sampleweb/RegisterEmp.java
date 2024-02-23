package com.brytcode.sampleweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brytcode.sampleweb.model.Employee;
import com.brytcode.sampleweb.repo.EmployeeRepo;

public class RegisterEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empName = request.getParameter("ename");
		double empSalary = Double.parseDouble(request.getParameter("empsalary"));
		int deptNo  = Integer.parseInt(request.getParameter("deptno"));
		Employee emp = new Employee();
		emp.setDeptNo(deptNo);
		emp.setEname(empName);
		emp.setSalary(empSalary);		
		EmployeeRepo repo = new EmployeeRepo();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			repo.storeEmployee(emp);			
			out.write(String.format("<html><body><h2>%s registered successfully</h2></body></html>",empName));
		} catch (SQLException e) {		
			e.printStackTrace();
			out.write(String.format("<html><body><h2>Can not register %s</h2></body></html>",empName));	
		} catch (ClassNotFoundException e) {
			out.write(String.format("<html><body><h2>Can not register %s</h2></body></html>",empName));
		}
		
		
	}
}
