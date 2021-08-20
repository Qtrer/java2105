package com.example;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = ss.nextInt();
        boolean bb = true;
        if (a%3==0){
            System.out.println("能被3整除");
            bb = false;
        }
        if (a%5==0){
            System.out.println("能被5整除");
            bb = false;
        }
        if (a%7==0){
            System.out.println("能被7整除");
            bb = false;
        }
        if (bb){
            System.out.println("不能被3、5、7整除");
        }
    }
}
