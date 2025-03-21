package com.first;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AwtTest {

    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        a.isProbablePrime(10);
     anagram();
    }

    public static void anagram() {
         int[] arr = {4,2,6,5,9,7};
        AtomicInteger a = new AtomicInteger(0);
         //int secondLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        int secondLargest = Integer.MIN_VALUE, largest = Integer.MIN_VALUE;
         for(int i : arr){
              if(i > largest){
                  secondLargest = largest;
                  largest = i;
              }else if(i > secondLargest && i != largest){
                  secondLargest = i;
              }
         }
        System.out.println("Second Largest: " + secondLargest);
    }

}
