package com.second;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SuperTest{
    public void show(){
      String s1 = new String("hello");
      String s2 = new String("hello");
      String s3 = "hello";
      String s4 = "hello";
    }
    public void append(String sb){
       String s =  sb.concat(" world");
    }
    public SuperTest(){
        show();
    }
    public static void main(String[] args) {
        lukcyNumber();
    }

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original = x;
        int rev = 0;
        while(x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return  x==rev;
    }
    public int reverse(int x) {
        int sign  = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        long rev = 0;
        while(x>0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev * sign;
    }
    public int sumOfDigits(int n) {
        n = Math.abs(n);
        long sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return (int) sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> see = new HashSet<>();
        while (n != 1 && !see.contains(n)) {
            see.add(n);
            n = getSumOfSquare(n);
        }
        return n == 1;

    }
    int getSumOfSquare(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n/10;
        }
        return sum;
    }
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
       return null;
    }
    public boolean isValid(String s) {
        char[] ch  = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : ch){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(' &&
                        c == '}' && top != '{' &&
                        c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for(int i = nonZeroIndex;i<nums.length;i++){
            nums[i] = 0;
        }
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
                for (int j = i * 2; j < n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        return count;
    }
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i : nums){
           if(set.contains(i)){
               return true;
           }
           set.add(i);
       }
       return false;
    }
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(i %3==0 && i%5!=0){
                list.add("Fizz");
            }
            else if(i%5==0 && i%3!=0){
                list.add("Buzz");
            }else if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
    public void encode(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' '){
                sb.append(' ');
            }else if(c == 'z'){
                sb.append('a');
            }else if(c == 'Z'){
                sb.append('A');
            }else{
                sb.append((char) (c+1));
            }
        }
        System.out.println(sb.toString());
    }

    public static int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        int result =   sumValue(num);
        return result;

    }
    static  boolean valueSingleDigit(int value){
       return value >= 0 && value <= 9;
    }
    static int sumValue(int value){
        int sum = 0;
        while(value > 0){
            int digit = value % 10;
            value = value / 10;
            sum += digit;
        }
        if(!valueSingleDigit(sum)){
            return sumValue(sum);
        }
        return sum;
    }
    static String countAndSay(int n){
        String res = "1";
        for(int i = 1;i<n;i++) {
            res = getNext(res);
        }
        return res;
    }
    static String getNext(String res){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < res.length()){
            int count = 1;
            while(i + 1 < res.length() && res.charAt(i) == res.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count).append(res.charAt(i));
            i++;
        }
        return sb.toString();
    }
    static void lukcyNumber(){
        int[] arr = {12, 23, 34, 44, 49, 70, 88};
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(arr).filter(i -> {
            int sum = String.valueOf(i).chars()
                    .map(ch -> ch - '0') // convert char to digit
                    .sum();
            return sum % 4 == 0 || sum % 7 == 0;
        }).boxed().collect(Collectors.toList());
        for(int i : arr){
            int j = i;
            int sum = 0;
            while(j > 0){
                int digit =  j % 10;
                j = j / 10;
                sum += digit;
            }
            if(sum % 4 == 0 || sum % 7 == 0){
                list.add(i);
            }

        }
    }

}