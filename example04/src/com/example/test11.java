package com.example;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = ss.nextInt();
        System.out.println("请输入第二个数：");
        int b = ss.nextInt();
        System.out.println("请输入第三个数：");
        int c = ss.nextInt();
        int max = a>b?a:b;
        max = max>c?max:c;
        System.out.println(max);


    }
}
