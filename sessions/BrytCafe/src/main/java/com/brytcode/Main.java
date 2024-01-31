package com.brytcode;

import com.brytcode.bos.BrytCafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BrytCafe brytCafe = new BrytCafe();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int id;
        do{
            System.out.println("Enter your choice \n1)Take Order (Sales Personal) \n2)Prepare Order (Barista) \n3)Annouse Completion(Barista) \n4)Print Baristas");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    brytCafe.takeOrder();
                    break;
                case 2:
                    System.out.println("Enter your id");
                    id = Integer.parseInt(sc.nextLine());
                    brytCafe.prepareOrder(id);
                    break;
                case 3:
                    System.out.println("Enter your id");
                    id = Integer.parseInt(sc.nextLine());
                    brytCafe.annouseOrderCompletion(id);
                    break;
                case 4:
                    brytCafe.printBaristas();
                    break;
            }
        }while(choice != 0);
    }
}
