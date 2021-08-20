package com.example;

import java.util.Scanner;

class User{
    int account;
    int password;
    int money;
}

public class demo0604 {
    public static void main(String[] args) {
        User user = new User();
        Scanner ss = new Scanner(System.in);
        user.account = 101;
        user.password = 101;
        user.money = 1000;
        boolean bb = true;
        while (bb){
            System.out.println("1.存款    2.取款    3.退出");
            int a = ss.nextInt();
            switch (a){
                case 1:
                    System.out.println("存款金额：");
                    int in_money = ss.nextInt();
                    user.money += in_money;
                    System.out.println("当前金额：" + user.money);
                    break;
                case 2:
                    System.out.println("取款金额：");
                    int out_money = ss.nextInt();
                    if (out_money>user.money){
                        System.out.println("余额不足");
                        break;
                    }
                    user.money -= out_money;
                    System.out.println("当前金额：" + user.money);
                    break;
                case 3:
                    bb = false;
                    break;
            }
        }
    }
}
