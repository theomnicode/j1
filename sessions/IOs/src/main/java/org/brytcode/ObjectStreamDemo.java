package org.brytcode;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* Employee emp = new Employee(1,"Kumar","Kumar123");
        Employee emp2 = new Employee(2,"Krishna","Krishna123");
        ObjectOutputStream ois =
                new ObjectOutputStream(new FileOutputStream(new File("C:/Krishna/Java/F1/Temp2/emps.obj")));
        ois.writeObject(emp);
        ois.writeObject(emp2);*/

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(new File("C:/Krishna/Java/F1/Temp2/emps.obj")));
        Employee emp = (Employee)ois.readObject();
        Employee emp2 = (Employee)ois.readObject();
        System.out.println(emp);
        System.out.println(emp2);
    }
}
