package com.example;

public class test11 {
    public static void main(String[] args) {
        String str = "hello world";
        String substr = "Lo";
        System.out.println(stringAt(str, substr));
    }
    public static int stringAt(String str, String substr){
        if (str.toLowerCase().contains(substr.toLowerCase())){
            return str.toLowerCase().indexOf(substr.toLowerCase());
        }
        return -1;
    }
}
