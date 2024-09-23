package com.first;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        // List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Map<String, String> map = Map.of("1","12","2","14","3","15","4","20","5","40");
         int search = 18;
         int a = 6;
         String channel = "";
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

}
