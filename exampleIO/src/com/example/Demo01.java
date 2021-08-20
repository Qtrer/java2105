package com.example;
//一般而言，兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。如果所有兔都不死，那么一年以后可以繁殖多少对兔子
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(rabbit(12));
    }
    public static long rabbit(int month){
        if (month ==1 || month == 2) return 1;
        else return rabbit(month-1)+rabbit(month-2);
    }
}
