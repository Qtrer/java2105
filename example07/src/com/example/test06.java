package com.example;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i=0;i<a.length;i++){
            a[i] = i;
        }
        boolean flag = false;
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int x = ss.nextInt();
        for (int i=0;i<a.length;i++){
            if (a[i] == x){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("数字" + x + "在此数组中");
        }
        else {
            System.out.println("数字" + x + "不在此数组中");
        }
    }
}
