package com.brytcode.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.brytcode.model.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
    public void storeEmployee(Employee emp) throws SQLException, ClassNotFoundException {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Admin123$");                
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO EMPLOYEE (EMPNO,ENAME,SALARY,DEPTNO, EMP_UUID) VALUES(EMP_NO_SQ.NEXTVAL,?,?,?,?)");
            stmt.setString(1, emp.getEname());
            stmt.setDouble(2, emp.getSalary());
            stmt.setInt(3, emp.getDeptNo());
            stmt.setString(4, emp.getUUID());
            stmt.executeUpdate();

        }catch (SQLException ex){
        	ex.printStackTrace();
            conn.rollback();
            throw ex;
        }
    }
    public Employee getEmployee(String uuid) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Admin123$");
        PreparedStatement stmt = conn.prepareStatement("SELECT EMPNO,ENAME,SALARY,DEPTNO FROM EMPLOYEE WHERE EMP_UUID = ?");

        stmt.setString(1, uuid);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
        	int empNo = rs.getInt("EMPNO");
            String empName = rs.getString("ENAME");
            double empSalary = rs.getDouble("SALARY");
            int deptNo = rs.getInt("DEPTNO");
            Employee emp = new Employee();
            emp.setEmpNo(empNo);
            emp.setEname(empName);
            emp.setSalary(empSalary);
            emp.setDeptNo(deptNo);
            return emp;
        }
        return null;
    }
}

