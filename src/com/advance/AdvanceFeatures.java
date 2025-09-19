package com.advance;

import java.util.List;
import java.util.Optional;

public class AdvanceFeatures {
    public static void main(String[] args) {
        //🟢 Java 11 Features
        String s = "   Hello   ";
        //✅ isBlank
        System.out.println("   ".isBlank());
        System.out.println(s.strip()); // "Hello"
        System.out.println(s.stripLeading()); // "Hello  ";
        System.out.println(s.stripTrailing()); // "  Hello";

        System.out.println(s.repeat(3)); // "Hello Hello Hello"

        String multiline = "Hello\nJava\nand\nC++";
        multiline.lines().forEach(System.out::println);
        System.out.println(multiline);
        C();

    }
    static void A(){
        List<Integer> list = List.of(1,3,4,5,6);
        Integer[] arr = list.toArray(Integer[]::new);
        Optional<?> opt = Optional.empty();
        System.out.println(opt.isEmpty());
        Student s = new Student("user",121);
        System.out.println(s.name()+" : "+s.marks());
    }
    static void B(){
         String s = "1";
         String type = switch (s){
             case "MON","TUE","WED","THU","FRI" -> "WEEKDAYS";
             case "SAT","SUN" -> "WEEKENDS";
             default -> throw new IllegalStateException("Unexpected value: " + s);
         };
        System.out.println(type);

        // IN NEXT WAY
        var result = switch (s){
            case "1" ->{
                System.out.println("hello");
                yield "MON";
            }
            case "2" -> "Tues";
            default -> "Other";
        };
    }
    static void C(){
         {
             String json = """
                     {
                      "name":"USER",
                      "id": "1",
                      "branch":"IT"
                     }
                     """;
             System.out.println(json);
        }
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

//✅ IMPORTANT POINTS :)🙂
/*
   1. Switch advance stable in java 14;
   2. Text block multiline in string stable in java 15;
   3. Records DTO is stable in java 16;
   4. Sealed classes stable in java 17;
   5. Multiple string methods(isBlank(), strip(), stripLeading(), stripTrailing()) and var allowed in lambda is stable in java 11;
      But var released in java 10;
   6. private method is stable in interface via java 9;
   7. java 8 is much popular than other version;
   8. Virtual thread is stable in java 21;
*/