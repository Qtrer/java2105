package com.example;

public class test08 {
    public static void main(String[] args) {
        int m = 9;
        int n = ++m;
        System.out.println(m + ", " + n);
        m = 9;
        n = m++;
        System.out.println(m + ", " + n);
    }
}
