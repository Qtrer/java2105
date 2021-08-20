package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String str = ss.next();
        String[] strings = str.split("-");
        String[] titles = {"name", "age", "sex", "address"};
        for (int i=0;i<titles.length;i++){
            System.out.println(titles[i] + ":" + strings[i]);
        }
    }
}
