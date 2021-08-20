package com.example;

public class test08 {
    public static void main(String[] args) {
        String str = "Laner";
        System.out.println(concat(str));
    }
    public static String concat(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return str+stringBuffer.reverse().toString();
    }
}
