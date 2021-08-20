package com.example;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = ss.nextInt();
        if (a>80000){
            System.out.println("个人所得税：" + (0.45*(a-80000)+13505));
            System.out.println("税后工资：" + (a-0.45*(a-80000)-13505));
        }
        else if (a>55000){
            System.out.println("个人所得税：" + (0.35*(a-55000)+5505));
            System.out.println("税后工资：" + (a-0.35*(a-55000)-5505));
        }
        else if (a>35000){
            System.out.println("个人所得税：" + (0.3*(a-35000)+2755));
            System.out.println("税后工资：" + (a-0.3*(a-35000)-2755));
        }
        else if (a>9000){
            System.out.println("个人所得税：" + (0.25*(a-9000)+1005));
            System.out.println("税后工资：" + (a-0.25*(a-9000)-1005));
        }
        else if (a>4500){
            System.out.println("个人所得税：" + (0.2*(a-4500)+555));
            System.out.println("税后工资：" + (a-0.2*(a-4500)-555));
        }
        else if (a>3500){
            System.out.println("个人所得税：" + (0.1*(a-1500)+105));
            System.out.println("税后工资：" + (a-0.1*(a-1500)-105));
        }
        else {
            System.out.println("个人所得税：" + 0);
            System.out.println("税后工资：" + a);
        }
    }
}
