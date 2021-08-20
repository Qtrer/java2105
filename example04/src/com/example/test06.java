package com.example;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入字符：");
        char a = ss.next().charAt(0);
        if ((a>=65 && a<=90) || (a>=97 && a<=125)){
            System.out.println("是字母");
        }
        else {
            System.out.println("不是字母");
        }
    }
}
