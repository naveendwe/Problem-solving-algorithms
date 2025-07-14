package com.problems;

import java.util.List;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {
        star2();

    }
    static void star3(){
         for(int i = 0; i <= 4 ; i++){

         }
    }
   static void star2(){
        for(int i = 0; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                  if(i>=2 && j<=i-1){
                      System.out.print(" ");
                  }else{
                      System.out.print("*");
                  }
            }
            System.out.println();
        }
        for(int i = 0; i <= 4; i++){
             for(int j = 4; j >= i; j--){
                  if(j>i){
                      System.out.print(" ");
                  }else{
                      System.out.print("*");
                  }
             }
            System.out.println();
        }
    }
   static void star1(){
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            for(int l = 2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = 4; k>=i; k--){
                System.out.print("*");
            }
            for (int l = 3; l>=i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
