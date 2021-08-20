package com.example;

import java.util.Map;

public class test12 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 3;
        float p = (float)((a+b+c)/2.0);
        System.out.println("面积为：" + (Math.sqrt(p*(p-a)*(p-b)*(p-c))));
    }
}
