package com.first;

import org.w3c.dom.Node;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WordTest {
    public static void main(String[] args) {
        add();
    }
    public static void findSecondLastCharacterOfEachWord(){
        String sentence = "Hello World naveen";
        String[] words = sentence.split(" ");
        for(String word: words){
            System.out.println(word.charAt(word.length()-2));
        }
    }

    // for practices
    public static void  reverseStringEachSentence(String word){
         String[] sentences = word.split("");
         for(String s : sentences){
             System.out.println(s+" ");
         }
    }

    public void bubbleSort(){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    public void selectionSort(){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int leng = arr.length;
        for (int i = 0; i < leng-1; i++){
            int min_idx = i;
            for (int j = i+1; j < leng; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void frequencyOfEachCharacter(){
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
       HashSet<Integer> set = new HashSet<Integer>();
       list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       list.stream().max(Comparator.naturalOrder()).get();
       list.stream().filter(i -> i%5==0).forEach(System.out::println);
       list.stream().sorted().limit(3).forEach(System.out::println);
       list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
       list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       list.stream().skip(list.size()-1).findFirst().get();
       list.stream().filter(i -> !set.add(i)).collect(Collectors.toSet());
    }

    public static void sortString(){
       String s = "hello";
       Map<Character, Integer> map = new HashMap<Character, Integer>();
       for(char c : s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }
       for(char c : s.toCharArray()){
           if(map.get(c)==1) return;
       }
       return;
    }
    public static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while ( left < right){
            int mid = (left + right) / 2;
            if(mid == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        int majorityElement = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        System.out.println("Majority element is "+majorityElement);
    }
    public static void bubleSort(){
        int[] arr = {4,3,5,6,81,5,3,1};

        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
   printValue(arr);

    }
    public static void printValue(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void unionOfTwoArrays(int[] arr1, int[] arr2){
        int[] finalArray = new int[arr1.length+arr2.length];
        for(int i = 0; i < arr1.length; i++){
            if(!isDuplicate(finalArray, arr1[i])){
                finalArray[i] = arr1[i];
            }
        }
        for(int i = 0;i<arr2.length; i++){
            if(!isDuplicate(finalArray, arr2[i])){
                finalArray[arr1.length+i] = arr2[i];
            }
        }
        for(int i = 0;i<finalArray.length;i++){
            System.out.print(finalArray[i]+" ");
        }
    }
    public static boolean isDuplicate(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }
    public static void sumOfAllEvenNumbers(int[] arr){
        int sum = Arrays.stream(arr).filter(i -> i%2==0).sum();
        System.out.println("sum of all even numbers : "+sum);
    }
    public static void occuranceOfWord(String[] words){
         long count =  Arrays.stream(words).filter(i -> i.equals("apple")).count();
        System.out.println(count);
    }
    public static void first(){
       int[] arr = {2,4,3,7,5,6,8};
       int min = IntStream.of(arr).sorted().skip(arr.length-1).findFirst().getAsInt();
        System.out.println("minimum value of array : "+min);
    }
    public static void countDigit(int val){
         int num = val;
         int count = 0;
         while(num!= 0){
             num = num / 10;
             count++;
         }
    }
    public static void sumOfEachIntValue(int value){
        int sum = 0;
        while(value!=0){
            sum += value%10;
            value = value / 10;

        }
        System.out.println("sum of each digit "+sum);
    }
    public static void occurrenceOfNumber(){
        int num = 123212;
        int val = 2;
        int count = 0;
        while(num!=0){
            int lastDigit = num % 10;// for reminder
            if(lastDigit == val){
                count++;
            }
            num = num / 10;// for divisor
        }
        System.out.println("To occurance of number 2 is : "+count);
    }
    public static void toggleString(){
        String str = "jaVaTpoiNt";
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());
    }
    public static void findDuplicatesCharacter(){
        String str =  "pppdaf";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey()+" ");
            }
        }

    }
    public static void convertIntoJavaOutput(){
        String str = "helloJavaThisIsAExample";
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(str.contains("_")){
            int i = 0;
            for(char c : ch){
                if(c == '_'){
                    i++;
                    continue;
                } else{
                    if(i > 0) {
                        sb.append(Character.toUpperCase(c));
                        i = 0;
                    }else {
                        sb.append(c);
                    }
                }
            }
        }else{
            for(char c : ch){
                if(Character.isUpperCase(c)){
                    sb.append("_");
                    sb.append(Character.toLowerCase(c));
                } else{
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        System.out.println("In java : "+ sb);
    }
    public static void isAnagram(){
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;
        if(str1.length()!= str2.length()){
            isAnagram = false;
        } else{
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            isAnagram = Arrays.equals(ch1, ch2);
        }

        System.out.println("Are two strings anagrams? : "+isAnagram);
    }
    public static void add(){
        String a = "10";
        String b = "20";
        System.out.println(a+b+"hello");
    }
}
