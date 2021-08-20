package com.example;

public class test04 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0;i<a.length;i++){
            a[i] = i;
        }
        int max = -1;
        int index = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
                index = i;
            }
        }
        System.out.println("最大值为：" + max);
        System.out.println("位置为第" + index + "个");
    }
}
