package com.brytcode.sampleweb.repo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.brytcode.sampleweb.model.Employee;

public class EmployeeRepo {
    public void storeEmployee(Employee emp) throws SQLException, ClassNotFoundException {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Admin123$");                
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO EMPLOYEE (EMPNO,ENAME,SALARY,DEPTNO) VALUES(EMP_NO_SQ.NEXTVAL,?,?,?)");
            stmt.setString(1, emp.getEname());
            stmt.setDouble(2, emp.getSalary());
            stmt.setInt(3, emp.getDeptNo());
            stmt.executeUpdate();

//            PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO OTHERTABLE (EMPNO,ENAME,SALARY,DEPTNO) VALUES(?,?,?,?)");
//            stmt2.setInt(1, emp.getEmpNo());
//            stmt2.setString(2, emp.getEname());
//            stmt2.setDouble(3, emp.getSalary());
//            stmt2.setInt(4, emp.getDeptNo());
//            stmt2.executeUpdate();
//            conn.commit();
        }catch (SQLException ex){
            conn.rollback();
            throw ex;
        }
    }
}
