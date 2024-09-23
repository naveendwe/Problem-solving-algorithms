package com.first;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
	     List<Integer> list = List.of(1,2,2,3,4,5,5,6,7);
	     Set<Integer> set = new HashSet<>();
	     List<Integer> list2 =  list.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
	     System.out.println(list2);
	}
}
