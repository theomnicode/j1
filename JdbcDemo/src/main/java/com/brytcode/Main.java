package com.brytcode;

import com.brytcode.models.Employee;
import com.brytcode.repo.EmployeeRepo;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee no");
        int empNo = Integer.parseInt(sc.nextLine());
        EmployeeRepo empRepo = new EmployeeRepo();
        Employee emp = null;
        try {
            emp = empRepo.getEmployee(empNo);
            System.out.println(emp);
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Unable to fetch the employee details");
        }*/
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter employee name");
//        String empName = sc.nextLine();
        EmployeeRepo empRepo = new EmployeeRepo();
//        Employee emp = null;
//        try {
//            emp = empRepo.getEmployee(empName);
//            System.out.println(emp);
//        }catch(SQLException ex){
//            ex.printStackTrace();
//            System.out.println("Unable to fetch the employee details");
//        }
        try{
            Employee emp = new Employee();
//            System.out.println("Enter empId");
//            emp.setEmpNo(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter emp name");
            emp.setEname(sc.nextLine());
            System.out.println("Enter salary");
            emp.setSalary(Double.parseDouble(sc.nextLine()));
            System.out.println("Enter deptno");
            emp.setDeptNo(Integer.parseInt(sc.nextLine()));
            empRepo.storeEmployee(emp);
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("Unable to fetch the employee details");
        }
    }
}