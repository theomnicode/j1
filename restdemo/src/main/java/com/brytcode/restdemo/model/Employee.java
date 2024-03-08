package com.brytcode.restdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @Column(name="EMPNO")
    private int empNo;
    @Column(name = "ENAME")
    private String ename;
    @Column(name="SALARY")
    private Double salary;
    @Column(name="DEPTNO")
    private int deptNo;
    @Column(name="EMP_UUID")
    private String UUID; 

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    
    
    public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	@Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", deptNo=" + deptNo +
                '}';
    }
}
