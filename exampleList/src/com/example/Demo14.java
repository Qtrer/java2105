package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Demo14 {
    public static void main(String[] args) {
        Bag bag = new Bag(500,10);
        for (int i=1;i<11;i++){
            bag.open(String.valueOf(i));
        }
    }
}
class Bag{
    private int money;
    private int leftMoney;
    private int number;
    private int leftNumber;
    private Person[] people;
    private String expireTime;

    public Bag(int money, int number) {
        this.money = money;
        this.leftMoney = money;
        this.number = number;
        this.leftNumber = number;
        this.people = new Person[number];
    }
    public boolean open(String s){
        this.leftNumber--;
        if (this.leftNumber < 0) {
            System.out.println("this bag is empty");
            return false;
        }
        else if(this.leftNumber == 0){
            this.people[number-1] = new Person(s,leftMoney);
            System.out.println("success, you got " + leftMoney);
            this.leftMoney = 0;
            show();
            return true;
        }
        else {
            int getMoney = new Random().nextInt(this.leftMoney/2)+1;
            this.leftMoney-=getMoney;
            this.people[number-leftNumber-1] = new Person(s,getMoney);
            System.out.println("success, you got " + getMoney);
            show();
            return true;
        }
    }
    private void show(){
        System.out.println(this.leftNumber + "bag left, and" + this.leftMoney + "money left");
        for (Person p:people){
            if (p == null) break;
            System.out.println(p);
        }
    }
    private void setExpireTime(){
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE, 1);
        date = calendar.getTime();
        this.expireTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
    }
}
class Person{
    private String name;
    private double getMoney;

    public Person(String name, double getMoney) {
        this.name = name;
        this.getMoney = getMoney;
    }

    @Override
    public String toString() {
        return name + " get " + getMoney;
    }
}
