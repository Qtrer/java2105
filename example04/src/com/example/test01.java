package com.example;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        int score = ss.nextInt();
        if (score>=80){
            System.out.println("优秀");
        }
        else if (score>=70){
            System.out.println("良好");
        }
        else if (score>=60){
            System.out.println("及格");
        }
        else {
            System.out.println("不及格");
        }
    }
}
