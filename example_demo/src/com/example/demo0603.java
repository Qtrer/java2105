package com.example;

import java.util.Scanner;

public class demo0603 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int[][] info = new int[3][10];
        boolean bb = true;
        boolean is_login = false;
        int login_index = -1;
        int current_money = 0;
        int count = 0;
        while (bb){
            System.out.println("1.注册    2.登录    3.退出");
            System.out.println("请输入序号以执行相应操作：");
            int a = ss.nextInt();
            switch (a){
                case 1:
                    boolean error_flag = false;
                    System.out.println("请输入账号：");
                    int account = ss.nextInt();
                    for (int i=0;i<info[0].length;i++){
                        if (info[0][i] == account){
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
                    count++;
                    if (count>info[0].length){
                        int[][] info2 = new int[3][2*info[0].length];
                        for (int i=0;i<info[0].length;i++){
                            info2[0][i] = info[0][i];
                            info2[1][i] = info[1][i];
                            info2[2][i] = info[2][i];
                        }
                        info = info2;
                    }
                    info[0][count-1] = account;
                    info[1][count-1] = password;
                    info[2][count-1] = 0;
                    break;
                case 2:
                    System.out.println("请输入账号：");
                    account = ss.nextInt();
                    boolean flag = true;
                    for (int i=0;i<info[0].length;i++){
                        if (account == info[0][i]){
                            flag = false;
                            System.out.println("请输入密码：");
                            password = ss.nextInt();
                            if (password != info[1][i]){
                                System.out.println("错误：密码错误");
                                break;
                            }
                            else {
                                System.out.println("登陆成功");
                                is_login = true;
                                login_index = i;
                                current_money = info[2][i];
                            }
                        }
                    }
                    while (is_login){
                        System.out.println("1.存款    2.取款    3.转账    4.登出");
                        System.out.println("请输入序号以执行相应操作：");
                        int b = ss.nextInt();
                        switch (b){
                            case 1:
                                System.out.println("当前余额：" + current_money);
                                System.out.println("请输入存入金额：");
                                int in_money = ss.nextInt();
                                current_money+=in_money;
                                info[2][login_index] = current_money;
                                System.out.println("存款成功");
                                System.out.println("当前余额：" + current_money);
                                break;
                            case 2:
                                System.out.println("当前余额：" + current_money);
                                System.out.println("请输入取出金额：");
                                int out_money = ss.nextInt();
                                if (out_money > current_money){
                                    System.out.println("余额不足");
                                    break;
                                }
                                current_money-=out_money;
                                info[2][login_index] = current_money;
                                System.out.println("取款成功");
                                System.out.println("当前余额：" + current_money);
                                break;
                            case 3:
                                System.out.println("请输入要转账的账号：");
                                int trans_account = ss.nextInt();
                                int trans_index = -1;
                                int trans_money = 0;
                                for (int i=0;i<info[0].length;i++){
                                    if (info[0][i]==trans_account){
                                        trans_index = i;
                                        trans_money = info[2][i];
                                        break;
                                    }
                                }
                                System.out.println("当前余额：" + current_money);
                                System.out.println("请输入转账金额：");
                                out_money = ss.nextInt();
                                if (out_money > current_money){
                                    System.out.println("余额不足");
                                    break;
                                }
                                current_money-=out_money;
                                trans_money+=out_money;
                                info[2][login_index] = current_money;
                                info[2][trans_index] = trans_money;
                                System.out.println("转账成功");
                                System.out.println("当前余额：" + current_money);
                                break;
                            case 4:
                                is_login = false;
                                login_index = -1;
                                current_money = 0;
                                break;
                        }
                    }
                    if (flag){
                        System.out.println("错误：账号不存在");
                    }
                    break;
                case 3:
                    bb = false;
                    break;
            }
        }
    }
}
