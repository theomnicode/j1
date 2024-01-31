package com.krishna;

import java.util.Scanner;

public class TaskList {
    public static void main(String[] args) {
        String[][] tasks = new String[100][2];
        int[] priorities = new int[100];
        String[] dates = new String[100];
        int choice = 2;
        Scanner sc = new Scanner(System.in);
        String template = "%-50s, %d, %-30s, %s";
        int noOfTasks = 0;
        String assigneeName = "";
        do {
            System.out.println("Enter a choice \n 1)Create new task \n 2)List all tasks \n 3)List all tasks by assignee \n 0)Quit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("Creating new task");
                    System.out.println("Enter task name");
                    String name = sc.nextLine();
                    System.out.println("Enter assignee name");
                    assigneeName = sc.nextLine();
                    System.out.println("Enter priority");
                    int priority = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter target date in DD-MM-YYYY format");
                    String targetDate = sc.nextLine();

                    tasks[noOfTasks][0] = name;
                    tasks[noOfTasks][1] = assigneeName;
                    priorities[noOfTasks] = priority;
                    dates[noOfTasks] = targetDate;

                    noOfTasks++;
                    break;
                }
                case 2:
                    System.out.println("Listing all tasks");
                    for(int i=0;i<noOfTasks;i++){
                        System.out.println(String.format(template, tasks[i][0],priorities[i],tasks[i][1],dates[i]));
                    }
                    break;
                case 3:
                    System.out.println("Listing tasks of an assignee");
                    System.out.println("Enter the assignee name");
                    assigneeName = sc.nextLine();
                    for (int i = 0; i < noOfTasks; i++) {
                        if(tasks[i][1].equalsIgnoreCase(assigneeName)) {
                            System.out.println(String.format(template, tasks[i][0], priorities[i], tasks[i][1], dates[i]));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thank you, BYE");
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }while(choice != 0);
    }
}
