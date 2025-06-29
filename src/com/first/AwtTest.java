package com.first;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AwtTest {

    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        a.isProbablePrime(10);
        reverseString();

    }

    public static void anagram() {
         int[] arr = {4,2,6,5,9,7}; // this method is using for find second-largest value;
        AtomicInteger a = new AtomicInteger(0);
        OptionalInt i =  Arrays.stream(arr).sorted().skip(arr.length-2).findFirst();
        System.out.println(i.getAsInt());
         //int secondLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
//        int secondLargest = Integer.MIN_VALUE, largest = Integer.MIN_VALUE;
//         for(int i : arr){
//              if(i > largest){
//                  secondLargest = largest;
//                  largest = i;
//              }else if(i > secondLargest && i != largest){
//                  secondLargest = i;
//              }
//         }
//        System.out.println("Second Largest: " + secondLargest);
    }

    static void reverseString() { // this method is using for highest value occurrence
        int[] nums = {2, 2, 1, 1, 2, 2};
        int count = 0, candidate = 0;
        for (int num : nums) { // using for iterator
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        System.out.println(candidate);
    }

}
