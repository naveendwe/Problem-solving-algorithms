package com.problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>(Arrays.asList(new User("first",true,21),
                new User("second",false,21),new User("third",true,34),
                new User("fourth",true,33)));
        String input = "hello world";
        Map<Character, Long> result = input.chars().filter(i -> i!=' ').boxed().map(ch -> (char)(int)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        OptionalDouble av = OptionalDouble.of(list.stream().filter(User::isActive).mapToInt(User::getAge).average().orElse(0));
        System.out.println(av.getAsDouble());
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Optional<String> leng = words.stream().max(Comparator.comparingInt(String::length));
        List<String> emails = Arrays.asList(
                "a@gmail.com", "b@yahoo.com", "c@gmail.com", "d@outlook.com", "e@gmail.com", "f@yahoo.com"
        );
        Map<String, Integer> email = emails.stream().collect(Collectors.groupingBy(w -> w, Collectors.summingInt(w -> 1)));
        Map<String, Integer> map = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.summingInt(w -> 1)))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

}
class User {
    private String name;
    private boolean active;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, boolean active, int age) {
        this.name = name;
        this.active = active;
        this.age = age;
    }
}
