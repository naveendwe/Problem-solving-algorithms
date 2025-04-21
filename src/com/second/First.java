package com.second;


public class First {
    First() {
        System.out.println("First-Constructor");
    }
    void show() {
        System.out.println("show-first");
    }
    public static void main(String[] args) throws InvalidBookException {
        //First f = new A();
       // f.area();  // what will be displayed
        System.out.println("hello".length());
        if(5 < 6){
            throw new InvalidBookException("Invalid Book");
        }

    }
}
class A extends First {
    @Override
    void show() {
        System.out.println("show-A");
    }
    void area() {
        System.out.println("Area");
    }
}
class InvalidBookException extends Exception{
    public InvalidBookException(String message){
        super(message);
    }
}