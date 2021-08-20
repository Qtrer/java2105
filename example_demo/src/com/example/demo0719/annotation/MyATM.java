package com.example.demo0719.annotation;

@Table("atm")
public class MyATM {
    @PrimaryKey("PrimaryKey")
    private String account;
    private String password;
    private Integer remain;

    public MyATM(String account, String password, Integer remain) {
        this.account = account;
        this.password = password;
        this.remain = remain;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
}
