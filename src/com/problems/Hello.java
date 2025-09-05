package com.problems;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hello {
    public static void main(String[] args) {


    }
    static int missingNumber(){
        int[] arr = {2};
        int n = arr.length + 1;  // total numbers (1..n)
        long totalSum = (long) n * (n + 1) / 2; // use long to avoid overflow
        long arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return (int) (totalSum - arrSum);
    }

    // checking
    static void firstNonRepeatingChar(){
        String s = "leetcode";
        Set<Character> seen = new HashSet<>();
        for(char c : s.toCharArray()){
            if(seen.contains(c)){
                System.out.println(c+" : ");
                return;
            }
            seen.add(c);
        }
    }
}

interface A {
    int add(int a);
}
class Singleton{
        private static volatile Singleton instance;
        private Singleton(){
            // to prevent instantiation
        }
        public static  Singleton getInstance(){ // this is thread safe
            if(instance == null){
                 synchronized (Singleton.class){
                     if(instance == null){
                         instance = new Singleton(); // this is lazy thread safe and better performance
                     }
                 }
            }
            return instance;
        }
}