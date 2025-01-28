package com.first;

import java.util.*;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
//	     List<Integer> list = List.of(1,2,2,3,4,5,5,6,7);
//	     Set<Integer> set = new HashSet<>();
//	     List<Integer> list2 =  list.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
//	     System.out.println(list2);
		char[] ch  = {'h','e','l','l','o'};
		reverseString(ch);
	}
	public void findCommonElementsbetweenTwoArrays() {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};
		Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

		Set<Integer> commonElements = set1.stream().filter(set2::contains).collect(Collectors.toSet());

		System.out.println("Common elements between the two arrays: " + commonElements);
	}
     public  static void reverseString(){
		String str = "Hello World";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Reversed String: " + sb.toString());
	 }
	 public static void findLongestString(){
        String[] arr = {"Hello", "World", "Java", "Programming"};
        String longest = Arrays.stream(arr).max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Longest String: " + longest);
     }
	 public static void sortArray(){
         int[] arr = {10, 5, 2, 7, 9, 1};
         Arrays.sort(arr);
         System.out.println("Sorted Array: " + Arrays.toString(arr));
     }
	 public static void findFabonacci(){
		int n = 10;
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
		System.out.println("Fibonacci Series: " + Arrays.toString(fibonacci));
	 }
	 public static void findFactorial(){
		 int num = 5;
         int factorial = 1;
         for (int i = 1; i <= num; i++) {
             factorial *= i;
         }
         System.out.println("Factorial of " + num + " is: " + factorial);
	 }
	public static void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		while (left < right) {
			char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
		}
		/*Stack<Character> stack = new Stack<>();
		char[] result = new char[s.length];
		int index = s.length-1;
		for(char c : s){
			result[index] = c;
			index--;
		}
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}*/
	}
}
