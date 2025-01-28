package com.first;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewExample{
    public static void main(String[] args) {
       // findSecondLargest();
        First first = (a,b) -> a*b;
        int value = first.add(4,2);
        System.out.println(value);
        indexOfNonRepeatedCharacter();
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
        int[] elements = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,8,7,6,7);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,6,7,8,7,6,7);
        String s = "hello world";
        Map<Character, Long> map = new HashMap<Character, Long>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        set1 = list.stream().filter(i -> !set.add(i)).collect(Collectors.toSet());
        System.out.println(set1);
        Stream.of(s.split(" ")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        list.stream().filter(list2::contains).forEach(System.out::println);
        Arrays.stream(elements).sum();
        Arrays.stream(elements).average().getAsDouble();
        Arrays.stream(s.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining());
        IntStream.range(1,11).sum();
        Stream.of(s.split(" ")).map(String::toUpperCase).sorted().collect(Collectors.toList());
        list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        list.stream().filter(list2::contains).forEach(System.out::println);
        Arrays.stream(s.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
    }
    public static void show(){
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {6,5,4,3,2,1};
        int[] arr3 = new int[arr1.length+ arr2.length];
        List<String> list = List.of("hello", "world");
        list.stream().filter(i -> Character.isDigit(i.charAt(0))).forEach(System.out::println);
        list.stream().skip(list.size()-1).findFirst().get();
        IntStream.rangeClosed(1,arr1.length).map(i -> arr1[arr1.length-1]).toArray();
        arr3 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
        Stream.iterate(new int[] { 0, 1}, f -> new int[] { f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(i -> System.out.print(i + " "));
        First first = (a,b) -> a+b;
        int c = first.add(4,6);

    }
    public static void indexOfNonRepeatedCharacter(){
        String str = "Hello World";
        Set<Character> set = new HashSet<Character>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        for(int i = 0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                System.out.println("Non repeated character index point is " + i);
                break;
            }
        }
    }

}
interface First{
    int add(int a, int b);
}
