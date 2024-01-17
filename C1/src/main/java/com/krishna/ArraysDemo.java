package com.krishna;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values you need to sum");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter "+size+" values");

        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0;i<size;i++){
            result = result + nums[i];
        }

        System.out.println("Result is: "+result);



    }
}
