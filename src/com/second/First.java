package com.second;


public class First{
     First(){
        System.out.println("First");
    }
    public static void main(String[] args) {
        First f = new B();

    }
}
class A {
      void m1(){
          System.out.println("M!---A");
      }
}
class B extends First{
    B(){
        System.out.println("B");
    }
    void m2(){
        System.out.println("M2..B");
    }
}
