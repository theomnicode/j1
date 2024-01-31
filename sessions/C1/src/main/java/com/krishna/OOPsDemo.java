package com.krishna;

import com.krishna.bos.NormalTask;
import com.krishna.bos.ReviewTask;
import com.krishna.bos.Task;
import com.krishna.bos.TestTask;

import java.util.Scanner;

public class OOPsDemo {
    public static void main(String[] args) {
       /* Task codeTask = new Task("Coding Task", 5);
        codeTask.setAssignee("Krishna");
        System.out.println(codeTask);
        System.out.println(codeTask.getAssigneeName());*/
/*
        Task rTask = new ReviewTask("My First Review Task");
        rTask.setAssignee("Kumar");
        //rTask.setReviewer("Raja", true);

        System.out.println(rTask.startDate);
        System.out.println(rTask.display());
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 1)Review Task \n 2)Test Task \n 3) Normal Task");
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("Enter task name");
        String taskName = sc.nextLine();
        System.out.println("Enter assignee name");
        String assigneeName = sc.nextLine();
        Task task = null;
        String verifierName = null;
        switch (choice){
            case 1:
                System.out.println("Enter reviewer name");
                verifierName = sc.nextLine();
                task = new ReviewTask(taskName);
                break;
            case 2:
                System.out.println("Enter tester name");
                verifierName = sc.nextLine();
                task = new TestTask(taskName);
                break;
            case 3:
                task = new NormalTask(taskName);
                break;
        }
        task.setAssignee(assigneeName);
        task.setVerifierName(verifierName);
        System.out.println(task.display());

        Object task1 = new ReviewTask("");
        System.out.println(task1);

    }

}
