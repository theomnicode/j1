package com.brytcode.repo;

import com.brytcode.models.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
@Primary
public class EmployeeRepoImpl implements EmployeeRepo{
    public Employee getEmployee(int empNo) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Admin123$");
        PreparedStatement stmt = conn.prepareStatement("SELECTEMPNO,ENAME,SALARY,DEPTNO FROM EMPLOYEE WHERE EMPNO = ?");

        stmt.setInt(1, empNo);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
            String empName = rs.getString("ENAME");
            double empSalary = rs.getDouble("SALARY");
            int deptNo = rs.getInt("DEPTNO");
            Employee emp = new Employee();
            emp.setEmpNo(empNo);
            emp.setEname(empName);
            emp.setSalary(empSalary);
            return emp;
        }
        return null;
    }
    public Employee getEmployee(String empName) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Admin123$");
        Statement stmt = conn.createStatement();
        String query = "SELECT EMPNO,ENAME,SALARY,DEPTNO FROM EMPLOYEE WHERE ENAME = '"+empName+"'";
        System.out.println(query);
        ResultSet rs = stmt.executeQuery(query);
//       Raja';INSERT INTO EMPLOYEE VALUES(50000,'Jhonny',5230000,2);--

        if(rs.next()){
            int empNo = rs.getInt("EMPNO");
            double empSalary = rs.getDouble("SALARY");
            int deptNo = rs.getInt("DEPTNO");
            Employee emp = new Employee();
            emp.setEmpNo(empNo);
            emp.setEname(empName);
            emp.setSalary(empSalary);
            return emp;
        }
        return null;
    }

    public void storeEmployee(Employee emp) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Admin123$");
        //conn.setAutoCommit(false);
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
