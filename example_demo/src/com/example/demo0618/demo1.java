package com.example.demo0618;

import java.util.ArrayList;
import java.util.Collection;

public class demo1 {
    public static void main(String[] args) {
        Collection col1 = new ArrayList();
        Collection col2 = new ArrayList();
        col1.add(1);
        col1.add(2);
        col1.add(3);
        col2.add(10);
        col2.addAll(col1);
        System.out.println(col1.contains(1));
        System.out.println(col1.contains(0));
        Object[] objs = col2.toArray();
        for (Object obj : objs){
            System.out.println(obj);
        }

    }
}
