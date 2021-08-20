package com.example;

public class test03 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0;i<a.length;i++){
            a[i] = i;
        }
        int max = -1;
        int min = 999;
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("均值为：" + ((max+min)/2.0));
    }
}
