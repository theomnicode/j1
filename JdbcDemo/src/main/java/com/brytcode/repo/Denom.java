package com.brytcode.repo;

import com.sun.source.tree.Tree;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Denom {
    public static void main(String[] args) {

        Map<Integer, Integer> availableDenoms = new HashMap<>();
        availableDenoms.put(500,20);
        availableDenoms.put(100,10);
        availableDenoms.put(50,20);
        availableDenoms.put(20,5);
        availableDenoms.put(10,3);
        availableDenoms.put(5,2);
        int requiredAmount = 2505;
        Map<Integer, Integer> requiredDenoms = new HashMap<>();
        requiredDenoms.put(500,4);
        requiredDenoms.put(100,5);
        requiredDenoms.put(1,3);
        boolean available = true;
        for(Map.Entry<Integer, Integer> requiredDenomPair:requiredDenoms.entrySet()){
            if(!availableDenoms.containsKey(requiredDenomPair.getKey()) || (availableDenoms.get(requiredDenomPair.getKey())<requiredDenomPair.getValue())) {
                available = false;
                break;
            }
        }
        Map<Integer, Integer> denomCounts = new HashMap<>();
        if(!available) {
            System.out.println("Required Denoms Not Available, Alternative Denoms Are");
            Set<Integer> decendingDenoms = new TreeSet<>(Comparator.<Integer>comparingInt(e -> e).reversed());
            decendingDenoms.addAll(availableDenoms.keySet());
            Queue<Integer> denomsQueues = new LinkedList<>();
            denomsQueues.addAll(decendingDenoms);
            int balance = requiredAmount;
            while (!denomsQueues.isEmpty() && balance != 0) {
                int currentDenom = denomsQueues.remove();
                int denomCount = balance / currentDenom;
                int availableDenomCount = availableDenoms.get(currentDenom);
                int unavailableDenom = 0;
                if (availableDenomCount < denomCount) {
                    unavailableDenom = denomCount - availableDenomCount;
                    denomCount = availableDenomCount;
                }
                availableDenoms.put(currentDenom, availableDenoms.get(currentDenom) - denomCount);
                denomCounts.put(currentDenom, denomCount);
                balance = balance % currentDenom + (unavailableDenom * currentDenom);
            }
            if(balance>0){
                System.out.println("Possible Denominations Not Exists");
            }
        }else{
            denomCounts = requiredDenoms;
            for(Map.Entry<Integer, Integer> requiredDenomPair:requiredDenoms.entrySet()) {
                if(availableDenoms.containsKey(requiredDenomPair.getKey())) {
                    availableDenoms.put(requiredDenomPair.getKey(), availableDenoms.get(requiredDenomPair.getKey()) - requiredDenomPair.getValue());
                }
            }
        }
        System.out.println(denomCounts);
        System.out.println(availableDenoms);
    }
}
