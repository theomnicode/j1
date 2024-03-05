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
	    <form action="registeremp" method="POST">
	        <table>
	            <tr>
	                <td>
	                    Employee Name:
	                </td>
	                <td>
	                    <input type="text" name="ename">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    Employee Salary:
	                </td>
	                <td>
	                    <input type="text" name="empsalary">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    Department Number:
	                </td>
	                <td>
	                    <input type="text" name="deptno">
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