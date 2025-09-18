package com.second;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class CustomeException{
    ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int res = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        numbers.stream().collect(Collectors.groupingBy(n -> n % 3));
    }
}
