<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Employee Registration</title>
	</head>
	<body>	
		<f:form action="registeremp2" modelAttribute="regemp" method="POST">
			<table>
	            <tr>
	                <td>
	                    Employee Name:
	                </td>
	                <td>
	                	<f:input path="ename"/>	                    
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    Employee Salary:
	                </td>
	                <td>	                    
	                    <f:input path="salary"/>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    Department Number:
	                </td>
	                <td>
	                	<f:input path="deptNo"/>	                    
	                </td>
	            </tr>
	            <tr>
	                <td colspan="2">
	                    <input type="submit" value="Register">
	                </td>
	            </tr>
	        </table>	
			
		</f:form>	    
	</body>
</html>