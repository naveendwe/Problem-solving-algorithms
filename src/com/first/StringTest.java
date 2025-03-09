package com.first;

import java.io.File;

public class StringTest {
    int n;
    static int a = 5, fact = 1;
    public static void main(String[] args) {
//        StringTest st = new StringTest();
//        st.n = Integer.parseInt(args[0]);
//        System.out.println(st.n);
      //  show();
    }
    static void p(){
        if(a >= 1){
            fact = fact*a;
            a--;
            p();  // recursive call
        }else {
            System.out.println("Factorial value is : " + fact);
        }
    }
    public static void show(){
        int a = 0,b = 1,c;
        for(int i = 0; i<5;i++){
            c = a+b;
            System.out.println(c);
             a = b;
             b = c;  // update a and b for next iteration

        }

    }

    public static void file(){

    }
}
