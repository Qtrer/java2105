package com.example;

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入第一科成绩：");
        int a = ss.nextInt();
        System.out.println("请输入第二科成绩：");
        int b = ss.nextInt();
        System.out.println("请输入第三科成绩：");
        int c = ss.nextInt();
        System.out.println("总分：" + (a+b+c));
        System.out.println("均分：" + (float)((a+b+c)/3.0));
        System.out.println("第一科成绩：" + a);
        System.out.println("第二科成绩：" + b);
        System.out.println("第三科成绩：" + c);
    }
}
