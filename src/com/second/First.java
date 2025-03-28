package com.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class First {
    First() {
        System.out.println("First-Constructor");
    }

    void show() {
        System.out.println("show-first");
    }

    public static void main(String[] args) {
        //First f = new A();
        A a = new A();
        StringBuilder sb = new StringBuilder();
        sb.insert(0,"first");

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