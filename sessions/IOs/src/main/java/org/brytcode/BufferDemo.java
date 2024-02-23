package org.brytcode;

import java.util.Scanner;

public class BufferDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Name:"+name);
        System.out.print("Age:"+age);
    }
}
