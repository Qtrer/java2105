package com.example;

public class test07 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int count = 0;
        for (int i=0;i<a.length;i++){
            a[i] = i;
            count += a[i];
        }
        System.out.println(count/10.0);
    }
}
