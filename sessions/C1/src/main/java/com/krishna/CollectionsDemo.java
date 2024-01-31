package com.krishna;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<Integer> minors = new ArrayList<>();
        minors.add(10);
        minors.add(2);
        minors.add(3);

        Collection<Integer> majors = new ArrayList<>();
        majors.add(25);
        majors.add(26);
        majors.add(37);

        Collection<Integer> ages = new ArrayList<>();
        ages.add(60);
        ages.addAll(majors);
        ages.addAll(minors);
        minors.add(8);
        System.out.println(ages);
        Iterator<Integer> itr = ages.iterator();

        while(itr.hasNext()) {
            int age = itr.next();
            if(age>50){
                itr.remove();
            }
        }
        for(Integer age:ages){
            System.out.println(age);
        }
        System.out.println(ages);
    }
}
