package com.second;

import java.util.HashMap;
import java.util.Map;

public class CustomeException {

    public static void main(String[] args) {
      int[] arr = {4,3,2,5,6,3};
      logic(arr);
         for(int i : arr){
              System.out.print(i+" ");
         }
    }
    static int logic(int[] arr) {
         // maximum sub array
        int maxsum = arr[0], current = arr[0];
        for(int i=1; i<arr.length; i++){
            current = Math.max(arr[i], current+arr[i]);
            maxsum = Math.max(maxsum, current);
        }
        return maxsum;
    }
}