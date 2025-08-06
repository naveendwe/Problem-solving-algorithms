package com.first;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    static int a = 0,b=1,c=0;
    public static void main(String[] args) {

        isAnagram("car", "rac");
        // List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Map<String, String> map = Map.of("1","12","2","14","3","15","4","20","5","40");
         int search = 18;
         int nearestSearch = -1;
         int numberToOpen = 0;
         for (Map.Entry<String, String> entry : map.entrySet()) {
             if (Math.abs(Integer.parseInt(entry.getValue()) - search) < Math.abs(nearestSearch - search) || nearestSearch == -1) {
                 nearestSearch = Integer.parseInt(entry.getValue());
                 numberToOpen = Integer.parseInt(entry.getKey());
             }
         }
         if (nearestSearch!=-1){
             System.out.println("The nearest number to " + search + " is " + numberToOpen);
             return;
         }
         System.out.println("No nearest number found.");
    }
    void palindrome(){
        int number = 121;
        int reversedNumber = 0;
        int temp = number;
        while (temp!=0){
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp / 10;
        }
        if (reversedNumber == number){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
    void armstrong(){
        int number = 153;
        int sum = 0;
        int temp = number;
        int originalNumber = number;
        while (temp!=0){
            int remainder = temp % 10;
            sum = sum + (remainder * remainder * remainder);
            temp = temp / 10;
        }
        if (sum == originalNumber){
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
    void perfectNumber(){
        int number = 6;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number){
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not perfect");
        }
    }
    void fibonacci(){
        int number = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 2; i < number; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
    void primeNumber(){
        int number = 17;
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    return;
                }
            }
            System.out.println(number + " is a prime number.");
        }
    }
    void sumOfDigits(){
        int number = 123;
        int sum = 0;
        while (number!=0){
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    void reverseNumber(){
        int number = 12345;
        int reversedNumber = 0;
        while (number!=0){
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
    void factorial(){
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);
    }
    void findDuplicates(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Number of duplicates: " + count);
    }
    void showDuplicateNumber(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        int duplicateNumber = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicateNumber = array[i];
                    break;
                }
            }
        }
        System.out.println("Duplicate number: " + duplicateNumber);
    }
    void calculateAgeWithYearMonthDate(){
        int year = 2000;
        int month = 12;
        int day = 31;
        int currentYear = 2022;
        int currentMonth = 5;
        int currentDay = 17;

        int age = currentYear - year;
        if (currentMonth < month || (currentMonth == month && currentDay < day)) {
            age--;
        }

        System.out.println("Age: " + age + " years");
    }
    void calculateDaysBetweenDates(){
        int year1 = 2021;
        int month1 = 12;
        int day1 = 31;

        int year2 = 2022;
        int month2 = 5;
        int day2 = 17;

        int daysBetweenYears = (year2 - year1) * 365;
        int daysBetweenMonths = (month2 - month1) * 30;
        int daysBetweenDays = day2 - day1;

        int totalDays = daysBetweenYears + daysBetweenMonths + daysBetweenDays;
        System.out.println("Days between " + day1 + "/" + month1 + "/" + year1 + " and " + day2 + "/" + month2 + "/" + year2 + ": " + totalDays + " days");
    }
    static  void findNearestNumber(){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int search = 5;
        int nearestNumber = 0;
        for(int i = 0; i < numbers.length; i++){
            if(Math.abs(numbers[i] - search) < Math.abs(nearestNumber - search)){
                nearestNumber = numbers[i];
            }
        }
        System.out.println("Final nearest number is : "+nearestNumber);
    }

    public void nearestNumber(){
        List<Integer> list = Arrays.asList(1,5,8,4,6,7,9);
        int near = 0;
        int target = 4;
        for(int num : list){
            if(num < target){
                if(num > near){
                    near = num;
                }
            }
        }
    }

    public static void show(){
        int[] arr = {1,2,3,4,5,6,7,9};
        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("Minimum number is: " + min);
        HashSet<Integer> sorted = new HashSet<Integer>();
        int max = 0;
        for(int i : arr){
            max = Math.max(i, max);
            sorted.add(i);
        }
        for(int i = 0;i<=max;i++){
            if(!sorted.contains(i)){
                System.out.println("mising number is " + i);
            }
        }
    }
    public static void display(){
        String s = "listen";
        String s1 = "silent1";
        Stream.of(s.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String str =  Stream.of(s.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String str1 =  Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(str.equalsIgnoreCase(str1)){
            System.out.println("The strings are anagrams.");
        }
        else{
            System.out.println("The strings are not anagrams.");
        }
    }

    public static void countDigitOfnumber(int number){
        First first = (a,b) -> a+b;
        System.out.println(first.add(3,4));
        Predicate<Integer> predicate = (a) -> a>5;
        predicate.test(4);
        System.out.println("hello java");
        int count = 0;
        while(number > 0){
            number = number / 10;
            count++;
        }
    }
    interface First{
        int add(int a , int b);
    }
    public static void examTree(){
         int a = 11;
         for(int i = 2;i<a;i++){
             if(a%i==0) {
                 System.out.println("Number is not prime");
                 return;
             }
         }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
         for(char c : s.toCharArray()){
             if(c == '{' || c== '[' || c=='('){
                 stack.push(c);
             }else if( c =='}' || c==']' || c == ')'){
                 if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)){
                     return false;
                 }
             }

         }
         return stack.isEmpty();
    }
    public static boolean isMatchingPair(char c1, char c2) {
        return (c1 =='[' && c2==']')|| (c1=='{' && c2=='}')||(c1=='(' && c2==')');
    }
    public static void mergeTwoSortedList(List<String> l1, List<String> l2){
       List<String> list =  Stream.concat(l1.stream(), l2.stream()).sorted().collect(Collectors.toList());

    }
    public int maxProfit(int[] prices){
        if(prices == null || prices.length<2){
            return 0;
        }
        int minPrice = Integer.MIN_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            //updatat the minimum price
            if(price < minPrice){
                minPrice = price;
            }
            else if(price - minPrice > maxProfit){
                 maxProfit = price - minPrice;
            }
        }return maxProfit;
    }
    public static boolean isAnagram(String s, String t) {
         char[] s1 = s.toCharArray();
         char[] s2 = t.toCharArray();
         Arrays.sort(s1);
         Arrays.sort(s2);
         return Arrays.equals(s1, s2);
    }
    public void test(){
        System.out.println("hello".repeat(3));
        List<Integer> list = List.of(3,43,2,5,3);
        var map = Map.of(1,1,2,2,3,3);
        for(var value : map.entrySet()){
            System.out.println("hello".intern());
        }
        list.stream().filter(i -> i>50 && i != 60 && i != 70).forEach(System.out::println);
        list.stream().distinct().collect(Collectors.toList());
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        list.stream().sorted(Comparator.reverseOrder());
    }
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26]; // to store the last index of each character
        boolean[] seen = new boolean[26]; // to track characters in the current result
        Stack<Character> stack = new Stack<>();

        // Fill lastIndex with the last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If character already in result, skip it
            if (seen[c - 'a']) continue;

            // Remove characters that are bigger than current character
            // and can appear later again
            while (!stack.isEmpty() && c < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            seen[c - 'a'] = true;
        }

        // Build the final result
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }


}
