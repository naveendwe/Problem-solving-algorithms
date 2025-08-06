package com.first;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AwtTest {

    public static void main(String[] args) {
//        BigInteger a = BigInteger.ONE;
//        a.isProbablePrime(10);
//        reverseString();
        bubble();

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
    void mergeList(){
        List<List<String>> skills = Arrays.asList(
                Arrays.asList("java","servlet","spring"),
                Arrays.asList("javascript","react","angular"),
                Arrays.asList("Mysql","Oracle","Mongodb"));
       List<String> fi =  skills.stream().flatMap(Collection::stream).collect(Collectors.toList());
       fi = fi.stream().filter(i -> i.startsWith("s")).collect(Collectors.toList());
        System.out.println(fi);
    }
    static void bubble(){
        int[] arr = {12,10,15,5,25}; // TODO INSERTION SORT
        int temp , j;
        for(int i = 1;i<arr.length;i++){

            temp = arr[i];
            j = i;
            while(j>0 && arr[j-1] > temp){
                  arr[j] = arr[j-1];
                  j--;
            }
            arr[j] = temp;

        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

}
