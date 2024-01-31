package com.krishna;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        StringBuilder song1 = new StringBuilder("Janaganamana Adhinayaka Jayahe; Bharatha Bhagya Vidhataha");
//        String song2 = new String("Sare jahase accha, Hindhusitha hamara hamara ");
//        System.out.println(song1.equals(song2));
//        System.out.println(song1.length());
//        System.out.println(song1.toLowerCase());
//        System.out.println(song1.toUpperCase());
//        System.out.println(song1.substring(0,song1.indexOf("Jayahe")));
//        System.out.println(song1.startsWith("Janaganamana"));
//        System.out.println(song1.endsWith("Vidhataha"));
//        System.out.println(Arrays.toString(song1.split(";")));
//
//        char[] name = {'I','n','d','i','a'};
//        System.out.println(Arrays.toString(name));
//        String countryName = new String(name);
//        System.out.println(countryName.charAt(0));
//        String str1= "Banana";
//        String str2= "Apple";
//        System.out.println(str1.compareTo(str2));
//        System.out.println(song1.indexOf("Jayahe"));
        int start = song1.indexOf("Jayahe");
        int last = song1.indexOf("Jayahe") + "Jayahe".length();
        System.out.println(song1.replace(start,last,"JAYAHE"));
        System.out.println(song1);
        song1.append(";Jai Hindh");
        System.out.println(song1);
    }
}
