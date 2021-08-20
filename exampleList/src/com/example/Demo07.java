package com.example;

import java.util.*;

public class Demo07 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while (set.size()<5){
            set.add(new Random().nextInt(22)+1);
        }
        set.forEach(System.out::println);
    }
}
