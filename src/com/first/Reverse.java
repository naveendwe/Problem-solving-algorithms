package com.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

	public static void main(String[] args) {
		String string = "Naveen";
		String origString = "";
		origString = new StringBuilder(string).reverse().toString();
		//System.out.println(origString);
		secondLargest1();
       
	}
	public static void show() {
		String value = null;
	//	System.out.println(value.toUpperCase());
		
		String str = """
				this is first 
				program which is going 
				to held on 15 august 2024.
				so everybody be ready to celebrate 
				this function.
				""";
		System.out.println(str);
	
	}
	static void test() {
		 String s1 = "silent";
	        String s2 = "listen";
         s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         if(s1.equals(s2))
        	 System.out.println("Given value is anagram");
         else
        	 System.err.println("Not anagram");
  }
	static void sumInt() {
		 int a = 12345;
		 int sumOfInt = Stream.of(String.valueOf(a).split("")).collect(Collectors.summingInt(Integer::parseInt));
		 System.err.println(sumOfInt);
	}
	static void secondLargest() {
		  String str = "Java Concept Of The Day";
           String reverseString = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
        		                                 .collect(Collectors.joining(" "));
           System.out.println(reverseString);
	}
	static void startWithNum() {
		List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		int flag = 0;
		String lastValue = null;
		for(String str : listOfStrings) {
		     if(flag == listOfStrings.size()-1) {
		    	 lastValue = str;
		     }
		     flag ++;
		}
		System.out.println(lastValue);
	}
	static void secondLargest1() {
		int[] arr = {1,1,1,1,2,5,4,3,6,7,8};
		int k = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i +1; j<arr.length;j++) {
				  if(arr[i]<arr[j]) {
					   k = arr[j]; 
					   arr[j] = arr[i];
					   arr[i] = k;
				  }
			}
		}
		for(int i = 0 ;i < arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				System.out.println("Second largest value is : "+arr[i+1]);
				break;
			}else {
				
			}
		}
	}
}
