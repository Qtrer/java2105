package com.example;

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = ss.nextInt();
        if (a>10000){
            System.out.println(0.05*(a-10000)+150+80);
        }
        else if (a>5000){
            System.out.println(0.03*(a-5000)+80);
        }
        else if (a>1000){
            System.out.println(0.02*(a-1000));
        }
        else {
            System.out.println("笑死根本不交");
        }
    }
}
