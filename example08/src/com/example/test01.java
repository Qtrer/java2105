package com.example;

public class test01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        for (int i=0;i<a.length;i++){
            a[i] = i;
        }
        for (int i=a.length;i>0;i--){
            b[a.length-i] = a[i-1];
        }
        for (int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
    }
}
