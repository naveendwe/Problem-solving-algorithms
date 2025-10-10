package com.second;

import com.first.LinkedListEx;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CustomeException {
    public static void main(String[] args) {
        uppperCaseList();

       /* List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int res = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        Map<String, List<Integer>> maps =  numbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even":"Odd"));
        System.out.println(maps);*/
    }

    static void b() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        Map<Boolean, List<Integer>> s = list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println("Result : " + s);
    }

    static boolean validParenthesis() {
        String s = "{()}[](((())))";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) return false;
                if ((stack.peek() == '{' && c == '}') || (stack.peek() == '(' && c == ')')
                        || (stack.peek() == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    static boolean isPowerOfTwo(long n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    static void factorial(int n) {
        String str = "aabcccccaaa";
        StringBuilder sb = new StringBuilder();
        char prev = '1';
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(sb.length() < str.length() ? sb.toString() : str);
    }

    static void twoSum() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 6;

    }

    static int findMissing(int[] arr, int n) {
        int xor1 = 0, xor2 = 0;
        // xor for all element from 1 to n;
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // xor all array element;
        for (int i : arr) {
            xor2 ^= i;
        }
        // xor of both gives missing numbers
        return xor1 ^ xor2;

    }
    static int lengthOfLongestSubstring(String s){
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            // remove left character until unique
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    static void uppperCaseList(){
        String str = "hello";
        List<String> list = List.of("This","Is","First","Program");
        list = list.stream().map(String::toUpperCase).toList();
        System.out.println(list);
    }
}
