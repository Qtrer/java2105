package com.example;

public class test05 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i=0;i<a.length;i++){
            a[i] = i;
        }
        boolean flag = false;
        for (int i=0;i<a.length;i++){
            if (a[i] == 5){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("数字5在此数组中");
        }
        else {
            System.out.println("数字5不在此数组中");
        }
    }
}
