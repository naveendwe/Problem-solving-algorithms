package com.problems;



import java.util.List;

public class Circle{
    public Circle(){
        System.out.println("circle c");
    }
    public void show(){
        System.out.println("Circle");
    }

    public static void main(String[] args) {

          Circle c = new Circle();
          c.show();
    }
}
class Dog extends Circle{
    public Dog(){
        System.out.println("dogc");
    }
    public void show(){
        System.out.println("Dog");
    }
    void cow(){
        System.out.println("cow");
    }
}