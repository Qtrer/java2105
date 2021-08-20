package com.example;

import java.util.Scanner;

public class demo0601 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int[] accounts = new int[10];
        int[] passwords = new int[10];
        int[] moneys = new int[10];
        boolean bb = true;
        boolean is_login = false;
        int login_index = -1;
        int current_money = 0;
        while (bb){
            System.out.println("1.注册    2.登录    3.存款    4.取款    5.登出    6.退出");
            System.out.println("请输入序号以执行相应操作：");
            int a = ss.nextInt();
            switch (a){
                case 1:
                    boolean error_flag = false;
                    System.out.println("请输入账号：");
                    int account = ss.nextInt();
                    for (int i=0;i<accounts.length;i++){
                        if (accounts[i] == account){
                            System.out.println("错误：账号已存在");
                            error_flag = true;
                            break;
                        }
                    }
                    if (error_flag){
                        break;
                    }
                    System.out.println("请输入密码：");
                    int password = ss.nextInt();
                    System.out.println("请确认密码：");
                    int confirm_password = ss.nextInt();
                    if (password != confirm_password){
                        System.out.println("错误：两次密码不一致");
                        break;
                    }
                    boolean append_flag = true;
                    for (int i=0;i<accounts.length;i++){
                        if (accounts[i] == 0){
                            accounts[i] = account;
                            passwords[i] = password;
                            moneys[i] = 0;
                            append_flag = false;
                            break;
                        }
                    }
                    if (append_flag){
                        int[] temp_accounts = new int[accounts.length*2];
                        int[] temp_passwords = new int[passwords.length*2];
                        int[] temp_moneys = new int[moneys.length*2];
                        for (int i=0;i<accounts.length;i++){
                            temp_accounts[i] = accounts[i];
                            temp_passwords[i] = passwords[i];
                            temp_moneys[i] = moneys[i];
                        }
                        accounts = temp_accounts;
                        passwords = temp_passwords;
                        moneys = temp_moneys;
                        for (int i=0;i<accounts.length;i++){
                            if (accounts[i] == 0){
                                accounts[i] = account;
                                passwords[i] = password;
                                moneys[i] = 0;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("请输入账号：");
                    account = ss.nextInt();
                    boolean flag = true;
                    for (int i=0;i<accounts.length;i++){
                        if (account == accounts[i]){
                            flag = false;
                            System.out.println("请输入密码：");
                            password = ss.nextInt();
                            if (password != passwords[i]){
                                System.out.println("错误：密码错误");
                                break;
                            }
                            else {
                                System.out.println("登陆成功");
                                is_login = true;
                                login_index = i;
                                current_money = moneys[i];
                            }
                        }
                    }
                    if (flag){
                        System.out.println("错误：账号不存在");
                    }
                    break;
                case 3:
                    if (is_login){
                        System.out.println("当前余额：" + current_money);
                        System.out.println("请输入存入金额：");
                        int in_money = ss.nextInt();
                        current_money+=in_money;
                        moneys[login_index] = current_money;
                        System.out.println("存款成功");
                        System.out.println("当前余额：" + current_money);
                    }
                    else {
                        System.out.println("错误：请先登录");
                    }
                    break;
                case 4:
                    if (is_login){
                        System.out.println("当前余额：" + current_money);
                        System.out.println("请输入取出金额：");
                        int out_money = ss.nextInt();
                        if (out_money > current_money){
                            System.out.println("余额不足");
                            break;
                        }
                        current_money-=out_money;
                        moneys[login_index] = current_money;
                        System.out.println("取款成功");
                        System.out.println("当前余额：" + current_money);
                    }
                    else {
                        System.out.println("错误：请先登录");
                    }
                    break;
                case 5:
                    if (is_login){
                        is_login = false;
                        login_index = -1;
                        current_money = 0;
                    }
                    else {
                        System.out.println("错误：尚未登录");
                    }
                    break;
                case 6:
                    bb = false;
                    break;
            }
        }
    }
}