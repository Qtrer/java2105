package com.example;

public class test09 {
    public static void main(String[] args) {
        boolean m;
        int a = 1, b = 3, c = 9;
        m = (a>b) && (b<c);
        System.out.println(m);
        m = ((a>=b) && (b==c) || (c<a));
        System.out.println(m);
    }
}
