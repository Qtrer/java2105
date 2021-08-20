package com.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo05 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("q");
        set.add("w");
        set.add("e");
        set.add("w");
        set.add("r");
        for (String s:set){
            System.out.println(s);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
