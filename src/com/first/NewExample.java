package com.first;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewExample {
    public static void main(String[] args) {
        System.out.println("Hello, this is a new example.");
        findSecondLargest();
    }
    public static void frequencyOfEachElement(){
        // Code here to calculate the frequency of each element in an array
        String str = "Hello world";
        String[] elements = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = elements.length - 1; i >= 0; i--){
            sb.append(elements[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
    public static void findSecondLargest(){
        // Code here to find the second largest number in an array
       List<Integer> list = List.of(1,2,4,3,5,6,7,5,9);
       int secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);
    }
}
