package com.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.crypto.Mac;

public class Test {
    int a = 0;
	static int result = 5;
	public static void main(String[] args) {
		int[] num = {2,7,11,15};
		int target = 18;
		//twoSum(num, target);
		sort();
		
	}
	 public static  int[] twoSum(int[] nums, int target) {
		   int leng = nums.length;
		   for(int i = 0; i<leng-1;i++) {
			   for(int j = 0;j<leng-1;j++) {
				int sum =  nums[i] +nums[j];
				if(sum == target && i !=j) {
					System.out.println("["+i +","+j+"]");
					return new int[] {i,j};
				}
			   }
		   }
	        return null;
	    }
	 
	 public static void show() {
		 var list = List.of(1,2,3,4);
		 var map = Map.of(1,"2",2,"3");
		 for(var entry : map.entrySet()) {
			 System.err.println(entry.getValue());
		 }
	 }
	 public static void first() {
		 int value = 4;
//		var day =  switch (value) {
//		 case 1 -> 2;
//		 case 2 -> 5;
//		 default -> 4;
//
//		};
	 }
	 static void repeat() {
		 String str = "java";
		 char[] ch = str.toCharArray();
		 Map<Character, Integer> map = new HashMap<>();
		 for(char c : ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		 }
		 for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			 if(entry.getValue()==1) {
				 System.out.println("Non repeating first value is : "+entry.getKey());
			 }
		 }
	 }

		static void search(int fact) {
		      int a = 0, b = 1;
		      int c ;
		      for(int i = 0; i< 5; i++) {
		    	  c = a+b;
		    	  if(i <4) {
		    	  System.out.print(c +" + " );
		    	  }else {
					System.out.print(c);
				}
		    	  a = b;
		    	  b = c;
		      }
		}
		
		static void star() {
			int[] ar = {1,2,3,4,5,6,7,8};
			int search = 4;
			int min = 0;
			int max = ar.length-1;
			while(min<max) {
				int mid = (min+max)/2;
				if(ar[mid] == search) {
					System.out.println("value find at "+mid+" index position");
					return;
				}
				else if(ar[mid] < search ) {
					  min = mid+1;
				}else {
					max = mid-1;
				}
			}
		}
		static void armstrong() {
			String str = "listen", str1 = "silent";
			str = Stream.of(str.split("")).map(st -> st.toUpperCase()).sorted(Comparator.naturalOrder()).collect(Collectors.joining());
			str1 = Stream.of(str1.split("")).map(st1 -> st1.toUpperCase()).sorted(Comparator.naturalOrder()).collect(Collectors.joining());
			if(str.equals(str1))
				System.out.println("armstrong no");
			else
				System.out.println("Not...");
		}
		static void checkVovels() {
		     List<Integer> list = Arrays.asList(1,2,4,3,5,7,6,8);
		     list = list.stream().sorted().limit(3).collect(Collectors.toList());
		     System.out.println(list);
		    
		}
		static void sort() {
			int[] arr = {4,2,53,6,4,2,7};
			int temp;
			for(int i = 0; i<arr.length;i++) {
				  for(int j = 0; j<arr.length-1-i;j++) {
					  if(arr[j]> arr[j+1]) {
						  temp = arr[j];
						  arr[j] = arr[j+1];
						  arr[j+1] = temp;
					  }
				  }
			}
			for(int i : arr) {
				System.out.print(i+" ");
			}
		}
		public static class Pair implements Comparable<Pair>{
		    int node;
			int dist;
			public Pair(int node, int dist) {
				super();
                this.node = node;
                this.dist = dist;
            }


			@Override
			public int compareTo(Pair o) {
				return this.dist - o.dist;
			}
		}

	}
