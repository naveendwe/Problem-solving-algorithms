package com.problems;


import java.util.*;
import java.util.stream.Collectors;

public class AlgoTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add(null);
        set.add("abc");
        System.out.println(set);
    }
    static void zigZagCharMerge(){
        String input1 = "ABCDE";
        String input2 = "12345";
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i<input1.length() || j<input2.length()){
            if(i<input1.length()){
                sb.append(input1.charAt(i++));
            }
            if(j<input2.length()){
                sb.append(input2.charAt(j++));
            }
        }
        System.out.println(sb);
    }
    static void camelCaseSplitter(){
        String input = "myVariableNameIsCool";
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        for(char c : input.toCharArray()){
            if(Character.isUpperCase(c)){
                result.add(sb.toString());
                sb.setLength(0);
            }sb.append(c);
        }
        result.add(sb.toString());
        System.out.println(result);
    }
    static void sequentialOrder(){
        int[] arr = {1, 0, 1, 2, 0, 1,2, 0, 1, 0};
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
             for(int j = 0;j<arr.length;j++){
                  if(arr[j] > arr[i]){
                       int temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                  }
             }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }
    static void groupByLength(){

        List<String> list = Arrays.asList("hello", "java", "world", "program");
        List<Integer> salary = Arrays.asList(1,2,3,4,5);
        salary.stream().mapToInt(s -> s).sum();
        Map<Integer, List<String>> ma1p = list.stream().collect(Collectors.groupingBy(String::length));
        list.stream().filter(i -> i.equals("h")).limit(1).collect(Collectors.toList());
        Map<Integer, List<String>> map = new HashMap<>();
        for(String str : list){
            map.computeIfAbsent(str.length(), k -> new ArrayList<>()).add(str);
        }
        //System.out.println(map);
        // TODO WITH JAVA 8 FEATURES
        Map<Integer, List<String>> result = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);

    }
    static void target(){
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );
        List<String> list  = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
