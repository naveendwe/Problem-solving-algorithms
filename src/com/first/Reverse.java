package com.first;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

	public static void main(String[] args) {
		String string = "Naveen";
		String origString = "";
		origString = new StringBuilder(string).reverse().toString();
		//System.out.println(origString);
		int[] arr = {6,5,9,3,2,8};
		int n = arr.length;
		divide(arr,0,n-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
       
	}
	public static void show() {
		String value = null;
	//	System.out.println(value.toUpperCase());
	
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
		 int sumOfInt = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).sum();
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
			}
		}
	}
	void first(int[] arr){
		int leng = arr.length;
		for(int i = 0; i<leng-1;i++){
			int min_idx = i;
			for(int j = i+1;j<leng;j++){
				if(arr[j] < arr[min_idx]){
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
	}

	static void quickSort(int[] arr, int low, int high){
		if(low < high){
			int pivot = partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1, high);
		}
	}
	static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
		int i = low-1;
		for(int j = low;j<high;j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
        i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
	// Merge sort
	static void divide(int[] arr, int si, int ei){
		if(si >= ei){
			return;
		}
		int mid = si +(ei - si)/2;
		divide(arr,si,mid);
		divide(arr, mid+1, ei);
		conquer(arr,si,mid,ei);


	}
	static void conquer(int[] arr, int si, int mid, int ei){
         int[] merged = new int[ei - si +1];
		 int idx1 = si;
		 int idx2 = mid+1;
		 int x = 0;
		 while(idx1 <= mid && idx2 <= ei){
			 if(arr[idx1] <= arr[idx2]){
              merged[x++] = arr[idx1++];
			 }else{
				 merged[x++] = arr[idx2++];
			 }
		 }
		 while(idx1 <= mid){
			 merged[x++] = arr[idx1++];
		 }
		 while(idx2 <= ei){
			 merged[x++] = arr[idx2++];
		 }
		 for(int i = 0, j = si; i< merged.length;i++,j++){
             arr[j] = merged[i];
		}

	}
}
