package com.example;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = ss.nextInt();
        System.out.println("平方：" + (a*a));
        System.out.println("立方：" + (a*a*a));
    }
}
