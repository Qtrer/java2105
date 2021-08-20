package com.example;

public class test06 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println(((a>=b) == (b==c) == (c<a)));
        System.out.println((a!=b) == (a!=c) == (c==a));
        System.out.println(!(a>b));
    }
}
