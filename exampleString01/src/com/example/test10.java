package com.example;

public class test10 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abcabc";
        String str3 = "abcabcabcabcabc1";
        String str4 = "abcabcabcabc";
        String str5 = "abcabcabc";
        String[] strings = {str1, str2, str3, str4, str5};
        Integer[] lens = new Integer[5];
        for (int i=0;i<strings.length;i++){
            lens[i] = strings[i].length();
        }
        int index = 0;
        for (int i=1;i<lens.length;i++){
            if (lens[i]>lens[index]) index = i;
        }
        System.out.println(strings[index]);
    }
}
