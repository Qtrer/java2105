package com.example;

import java.text.DateFormat;
import java.util.Date;
import java.util.Formatter;

public class Demo04 {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        BankAccount user3 = new BankAccount();
        user1.show();
        user2.show();
        user3.show();
        user1.Bankin(1000);
        user2.Bankout(500);
        user3.Bankin(500);
        user3.Bankout(300);
    }
}
class BankAccount{
    private int BankAccountId;
    private String date = DateFormat.getInstance().format(new Date());
    private int Rest = 0;
    private static int AutoId = 1001;

    public BankAccount() {
        BankAccountId = AutoIncrease();
    }

    public int getBankAccountId() {
        return BankAccountId;
    }

    public String getDate() {
        return date;
    }

    public int getRest() {
        return Rest;
    }

    public void setRest(int rest) {
        Rest = rest;
    }
    public void show(){
        System.out.println("id:" + this.BankAccountId + " date:" + this.date + " rest:" + this.Rest);
    }
    public boolean Bankin(int count){
        this.Rest = this.getRest()+count;
        System.out.println(this.getBankAccountId() + "'s current rest:" + this.getRest());
        return true;
    }
    public boolean Bankout(int count){
        if (count > this.getRest()){
            System.out.println(this.getBankAccountId() + " have no enough money");
            return false;
        }
        else this.Rest = this.getRest()-count;
        System.out.println(this.getBankAccountId() + "'s current rest:" + this.getRest());
        return true;
    }
    public int AutoIncrease(){
        return AutoId++;
    }
}