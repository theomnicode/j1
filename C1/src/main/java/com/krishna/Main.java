package com.krishna;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int blockNumber = 5;

        int res = wish("Good Morning");
        System.out.println(res + "======");
        res = wish("Good Night");
    }

    public static int wish(String message){
        int len = message.length();
        System.out.println(message);
        return len;
    }
}