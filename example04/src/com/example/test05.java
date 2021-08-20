package com.example;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = ss.nextInt();
        System.out.println("请输入第二个数：");
        int b = ss.nextInt();
        System.out.println("请输入第三个数：");
        int c = ss.nextInt();
        if (a>1000 || b>1000 || c>1000){
            System.out.println("输入的数值有大于1000的");
        }
        else {
            System.out.println("无事发生");
        }
    }
}
