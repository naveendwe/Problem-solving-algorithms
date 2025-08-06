package com.problems;

public class Hello {
    public static void main(String[] args) {
       A aa = (a,b) -> a+" "+b;
       String result = aa.add("name",5);
       A.show();
       System.out.println(result);
    }
}

interface A {
    String add(String name, int a);
    static void show(){
        System.out.println("show");
    }
}
class Singleton{
        private static volatile Singleton instance;
        private Singleton(){
            // to prevent instantiation
        }
        public static  Singleton getInstance(){ // this is thread safe
            if(instance == null){
                 synchronized (Singleton.class){
                     if(instance == null){
                         instance = new Singleton(); // this is lazy thread safe and better performance
                     }
                 }
            }
            return instance;
        }
}