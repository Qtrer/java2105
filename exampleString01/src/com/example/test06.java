package com.example;

public class test06 {
    public static void main(String[] args) {
        String str = "apple is a apple.";
        int len = str.length();
        while (len > 0){
            String a = str.charAt(0)+"";
            str = str.replace(a,"");
            System.out.println(a + ":" + (len-str.length()));
            len = str.length();
        }
    }
}
