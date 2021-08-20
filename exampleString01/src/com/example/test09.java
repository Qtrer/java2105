package com.example;

public class test09 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(moveToRight(str, 2));
    }
    public static String moveToRight(String str, int position){
        String first = str.substring(0, str.length()-position);
        String last = str.substring(str.length()-position);
        return last+first;
    }
}
