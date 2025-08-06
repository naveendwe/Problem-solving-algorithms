package com.problems;

import java.sql.Connection;

public class Testing {
    public static void main(String[] args) {
        test();

    }
    static void test(){
        Runnable r = () -> System.out.println("hello");
        new Thread(r).start();
    }
    static void star8(){// TODO star pattern for understanding about basic loop
        for(int i = 0;i<=5;i++){
            for(int j = 0; j<=5;j++){
                if(i>0 && j>0 && i<5 && j<5){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void star7(){
      for(int i = 1;i<=5;i++){
           for(int j = 5;j>=i;j--){
               System.out.print(" ");
           }
           for(int k = 1;k<(i*2);k++){
               if(k>1 && k<(i*2)-1){
                   System.out.print(" ");
               }else{
                   System.out.print("*");
               }
           }
          System.out.println();
      }
    }
    static void star6(){
         for(int i = 0; i<=5;i++){
              for(int j = 5;j>=i;j--){
                  System.out.print(" ");
              }
              for(int k = 1;k<=i;k++){
                  System.out.print(" *");
              }
             System.out.println();
         }
    }
    static void star5(){ // todo star pattern for understanding about basic loop
        for(int i = 0;i<=5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star4(){ // todo star pattern for understanding about basic loop
        for(int i = 0; i<10; i++){
            for(int j = 0;j<10; j++){
                 if(i == j || i+j == 10-1){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
            }
            System.out.println();
        }
    }
    static void star3(){ // todo star pattern for understanding about basic loop
         for(int i = 0; i <= 5 ; i++){
              for(int j = 0; j<=10; j++){
                  if(i>0 && j >0 && i<5 && j<10){
                      System.out.print(" ");
                  }else{
                      System.out.print("*");
                  }
              }
             System.out.println();
         }
    }
   static void star2(){// todo star pattern for understanding about basic loop
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
   static void star1(){ // todo star pattern for understanding about basic loop
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
