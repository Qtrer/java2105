package com.example;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = ss.nextInt();
        if (a>100){
            System.out.println(0.8*(a-100)+95);
        }
        else if (a>50){
            System.out.println(0.9*(a-50)+50);
        }
        else {
            System.out.println(a);
        }
    }
}
