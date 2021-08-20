package com.example.demo0715.atm.vo;

import java.util.Random;

public class Atm {
    private String account;
    private String password;
    private Integer remain;
    private static String randomAccount(){
        StringBuffer str = new StringBuffer();
        Random random = new Random();
        for (int i=0;i<12;i++){
            if (i<3) str.append((char) (random.nextInt(26)+65));
            else if (i<6) str.append((char) (random.nextInt(26)+97));
            else str.append(random.nextInt(10));

        }
        return str.toString();
    }

    public Atm(String account, String password, Integer remain) {
        this.account = account;
        this.password = password;
        this.remain = remain;
    }

    public Atm(String password) {
        this.account = randomAccount();
        this.password = password;
        this.remain = 0;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    @Override
    public String toString() {
        return "账号：" + account + "  密码：" + password + "  余额：" + remain;
    }
}
