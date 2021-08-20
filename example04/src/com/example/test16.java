package com.example;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = ss.nextInt();
        switch (a/10){
            case 9:
                System.out.println("优秀");
                break;
            case 8:
            case 7:
                System.out.println("良好");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
