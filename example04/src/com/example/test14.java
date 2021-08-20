package com.example;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = ss.nextInt();
        System.out.println("请输入第二个数：");
        int b = ss.nextInt();
        System.out.println("请输入第三个数：");
        int c = ss.nextInt();
        int min = a<b?a:b;
        min = min<c?min:c;
        System.out.println(min);
    }
}
