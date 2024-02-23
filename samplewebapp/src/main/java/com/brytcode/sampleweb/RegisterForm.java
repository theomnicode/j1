package com.brytcode.sampleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Employee Registration</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <form action=\"empregistration\" method=\"POST\">\r\n"
				+ "        <table>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>\r\n"
				+ "                    Employee Name:\r\n"
				+ "                </td>\r\n"
				+ "                <td>\r\n"
				+ "                    <input type=\"text\" name=\"ename\">\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>\r\n"
				+ "                    Employee Salary:\r\n"
				+ "                </td>\r\n"
				+ "                <td>\r\n"
				+ "                    <input type=\"text\" name=\"empsalary\">\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td>\r\n"
				+ "                    Department Number:\r\n"
				+ "                </td>\r\n"
				+ "                <td>\r\n"
				+ "                    <input type=\"text\" name=\"deptno\">\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td colspan=\"2\">\r\n"
				+ "                    <input type=\"submit\" value=\"Register\">\r\n"
				+ "                </td>\r\n"
				+ "            </tr>\r\n"
				+ "        </table>\r\n"
				+ "    </form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
