package com.brytcode;

import com.brytcode.bos.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> emps = new HashSet<>();
        emps.add(new Employee(1,"Raja",153221.0,10));
        emps.add(new Employee(2,"Ravi",250000,10));
        emps.add(new Employee(3,"Seetha",300000.0,20));
        emps.add(new Employee(4,"Geetha",14523652.0,30));
        emps.add(new Employee(5,"Latha",30000000.0,20));
        Employee emp1 = new Employee(6,"Syam",45000000.0,30);
        Employee emp2 = new Employee(6,"Syamkumar",45000000.0,30);
        emps.add(emp1);
        emps.add(emp2);
        for(Employee emp:emps){
            System.out.println(emp);
        }
    }
}