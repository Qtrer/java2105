package com.example;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入语文成绩：");
        int a = ss.nextInt();
        System.out.println("请输入数学成绩：");
        int b = ss.nextInt();
        if (a>80 && b>80){
            System.out.println("获奖学金500元");
        }
        else if (a<30 && b<30){
            System.out.println("重修");
        }
        else {
            System.out.println("无事发生");
        }
    }
}
