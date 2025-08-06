package com.second;


import java.util.*;

public class First{
    public static void main(String[] args){
       Test t = new Test();
       t.test();
    }
}
class Test implements Test1, Test2, Test3{
    @Override
    public void test() {
        System.out.println("test");
    }
}
interface Test1 {
    default void test(){
        System.out.println("test1");
    }
}
interface  Test2{
    default void test(){
        System.out.println("test2");
    }
}
interface Test3{
    default void test(){
        System.out.println("Test3");
    }
}