package com.example;

public class test07 {
    public static void main(String[] args) {
        String str = "   123   ";
        System.out.println(rtrim(str));
    }
    public static String rtrim(String str){
        while (str.lastIndexOf(" ") == str.length()-1){
            str = str.substring(0,str.length()-1);
        }
        return str;
    }
}
