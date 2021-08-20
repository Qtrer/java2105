package com.example;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = ss.nextInt();
        if (a>90){
            System.out.println("Iphone6s");
        }
        else if (a>70){
            System.out.println("Redmi");
        }
        else {
            System.out.println("罚做 50 个俯卧撑");
        }
    }
}
