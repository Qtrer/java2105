package com.example;

public class test12 {
    public static void main(String[] args) {
        String str = "otto";
        StringBuffer stringBuffer = new StringBuffer(str);
        String string = stringBuffer.reverse().toString();
        System.out.println(str.equals(string));
    }
}
