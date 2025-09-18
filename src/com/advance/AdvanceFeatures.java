package com.advance;

import java.util.List;
import java.util.Optional;

public class AdvanceFeatures {
    public static void main(String[] args) {
        //🟢 Java 11 Features
        String s = "   Hello   ";
        // ✅ isBlank
        System.out.println("   ".isBlank());
        System.out.println(s.strip()); // "Hello"
        System.out.println(s.stripLeading()); // "Hello  ";
        System.out.println(s.stripTrailing()); // "  Hello";

        System.out.println(s.repeat(3)); // "Hello Hello Hello"

        String multiline = "Hello\nJava\nand\nC++";
        multiline.lines().forEach(System.out::println);
        System.out.println(multiline);

    }
    void A(){
        List<Integer> list = List.of(1,3,4,5,6);
        Integer[] arr = list.toArray(Integer[]::new);
        Optional<?> opt = Optional.empty();
        System.out.println(opt.isEmpty());
        Student s = new Student("User",121);
    }
}
sealed interface Car permits Engine{
    void start();
}
non-sealed class Engine implements Car {

    @Override
    public void start() {

    }
}
