package com.brytcode.bos;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int deptNo;

    public Employee() {
    }

    public Employee(int empId, String empName, double salary, int deptNo) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.deptNo = deptNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee)obj;
        return  this.empId == emp.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", deptNo=" + deptNo +
                '}';
    }
}
