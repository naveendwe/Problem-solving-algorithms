package com.problems;

public class FactoryTest {
    public static void main(String[] args){
         int[] arr = {4,3,2,67,8,5,4};
         int max= 0, sm = 0;
         for(int i : arr){
             if(i > max){
                 sm = max;
                 max = i;
             }else if(i > sm && i < max){
                 sm = i;
             }
         }
         System.out.print(sm);

    }
}
class TestException extends Exception{
    public TestException(String message){
        super(message);
    }
}
