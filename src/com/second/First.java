package com.second;


public class First {
    public static void main(String[] args){
       A a = new B();
       a.show();
    }
}
class A {
     void show(){
         System.out.println("A");
     }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
}
class InvalidBookException extends Exception{
    public InvalidBookException(String message){
        super(message);
    }
}