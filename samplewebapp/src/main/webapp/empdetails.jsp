<%@page import="com.brytcode.sampleweb.model.Employee"%>
<%@page import="com.brytcode.sampleweb.repo.EmployeeRepoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Employee Registration</title>
	</head>
	<body>
		<%!int a = 10;%>
		<%
		String uuid = session.getAttribute("EUUID").toString();
			EmployeeRepoImpl empRepo = new EmployeeRepoImpl();
			Employee emp = empRepo.getEmployee(uuid);
		%>
	    <form action="empregistration" method="POST">
	        <table>
	            <tr>
	                <td>
	                    Employee Name:
	                </td>
	                <td>
	                    <input type="text" name="ename" value="<%=emp.getEname() %>" readonly>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    Employee Salary:
	                </td>
	                <td>
	                    <input type="text" name="empsalary" value="<%=emp.getSalary() %>" readonly>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    Department Number:
	                </td>
	                <td>
	                    <span><%= emp.getDeptNo()%></span>
	                </td>
	            </tr>
	            <tr>
	                <td colspan="2">
	                    <input type="submit" value="Register">
	                </td>
	            </tr>
	        </table>
	    </form>
	</body>
</html>