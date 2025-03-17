package com.first;

import java.io.File;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest {
    int n;
    static int a = 5, fact = 1;
    public static void main(String[] args) {
//        StringTest st = new StringTest();
//        st.n = Integer.parseInt(args[0]);
//        System.out.println(st.n);
      //  show();]
        file();
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

    public static void file() {

        String a[] = {
                "first",
                "second",
                "third",
                "fourth",
                "fifth"
        };
        String b[] = {"first", "second", "third", "fourth", "fifth"};
        String value = "first";
        List<String> list = Arrays.asList("first", "second", "third", "fourth", "fifth");
        Arrays.fill(a, 1,3,"4");
        System.out.println(Arrays.toString(a));
        StringTokenizer st ;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.shutdown();
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        for(String s : list){
//            map.put(s, map.getOrDefault(s,0)+1);
//        }
//        System.out.println(map);
//        long count = list.stream()
//                .flatMap(i -> Arrays.stream(i.split(" ")))
//                .filter(i -> i.equals(value))
//                .count();
//        System.out.println(count);
//      List<String> ss =   Stream.concat(Stream.of(a), Stream.of(b)).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        System.out.println(ss);
//        List<String> sortedData = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//        System.out.println(sortedData);
        //Arrays.stream(a).filter(i -> i.startsWith("f")).forEach(i -> System.out.print(i+" "));
    }
    public void test(){
        Rest r  = (a, b) -> a*b;
        r.show(4,5);
    }

}
interface  Rest{
    public int show(int a, int b);
}
