package com.example.demo0715.atm;

import com.example.demo0715.atm.dao.AtmDao;
import com.example.demo0715.atm.daoImpl.AtmDaoImpl;
import com.example.demo0715.atm.vo.Atm;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Atm atm = new Atm("123456");
//        System.out.println(atm);
        Scanner ss = new Scanner(System.in);
        AtmDao dao = new AtmDaoImpl();
        boolean main = true;
        while (main){
            System.out.println("--------------------主菜单----------------------");
            System.out.println("- 请输入相应操作的序号：                         -");
            System.out.println("-          1.注册    2.登录    3.退出           -");
            System.out.println("--------------------ATM系统---------------------");
            int a = ss.nextInt();
            switch (a){
                case 1:
                    System.out.println("请输入密码：");
                    String pwd = ss.next();
                    System.out.println("请重复密码：");
                    String con_pwd = ss.next();
                    if (!pwd.equals(con_pwd)){
                        System.out.println("两次密码不一致，请重新注册...");
                        break;
                    }else {
                        Atm atm = new Atm(pwd);
                        atm = dao.register(atm);
                        System.out.println("注册成功，请熟记您的账号信息...");
                        System.out.println(atm);
                        break;
                    }
                case 2:
                    System.out.println("请输入账号：");
                    String account = ss.next();
                    System.out.println("请输入密码：");
                    String password = ss.next();
                    Atm login_atm = dao.login(account, password);
                    if (login_atm != null){
                        boolean sub = true;
                        while (sub){
                            System.out.println("-------------------------功能菜单--------------------------");
                            System.out.println("- 请输入相应操作的序号：                                    -");
                            System.out.println("- 1.查询账户信息    2.存款    3.取款    4.转账    5.退回上级 -");
                            System.out.println("-------------------------ATM系统---------------------------");
                            int b = ss.nextInt();
                            switch (b){
                                case 1:
                                    System.out.println(login_atm);
                                    break;
                                case 2:
                                    System.out.println("请输入存款金额：");
                                    int save_money = ss.nextInt();
                                    dao.save(login_atm, save_money);
                                    login_atm.setRemain(login_atm.getRemain()+save_money);
                                    break;
                                case 3:
                                    System.out.println("请输入取款金额：");
                                    int draw_money = ss.nextInt();
                                    dao.draw(login_atm, draw_money);
                                    login_atm.setRemain(login_atm.getRemain()-draw_money);
                                    break;
                                case 4:
                                    System.out.println("请输入转账账户：");
                                    String transfer_account = ss.next();
                                    System.out.println("请输入转账金额：");
                                    int transfer_money = ss.nextInt();
                                    dao.transfer(login_atm,transfer_account,transfer_money);
                                    login_atm.setRemain(login_atm.getRemain()-transfer_money);
                                    break;
                                case 5:
                                    System.out.println("正在退出账户...");
                                    login_atm = null;
                                    sub = false;
                                    break;
                                default:
                                    System.out.println("序号错误，请重新输入...");
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("正在退出，欢迎下次使用...");
                    main = false;
                    break;
                default:
                    System.out.println("序号错误，请重新输入...");
                    break;
            }
        }
    }
}
