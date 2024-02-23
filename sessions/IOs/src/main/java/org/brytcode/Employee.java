package org.brytcode;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private static final long serialVersionUID = 2L;
    private int empId;
    private String empName;
    transient private String password;
    public Employee() {
        System.out.println("Default");
    }

    public Employee(int empId, String empName) {
        System.out.println("Parameterized");
        this.empId = empId;
        this.empName = empName;
    }

    public Employee(int empId, String empName, String password) {
        this.empId = empId;
        this.empName = empName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(password.toUpperCase());
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        password = in.readUTF();
    }
}
