package com.example;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner ss = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("请输入第" + (i+1) + "个数：");
            a[i] = ss.nextInt();
        }
        int index = 5;
        boolean bb = true;
        while (bb){
            System.out.println("当前数组为：");
            for (int i=0;i<index;i++){
                System.out.print(a[i] + "\t");
            }
            System.out.println("\n请选择操作：1.插入  2.删除    3.退出");
            int x = ss.nextInt();
            switch (x){
                case 1:
                    if (index>=10){
                        System.out.println("错误：数组已满");
                        break;
                    }
                    System.out.println("请输入指定位置：");
                    int in_index = ss.nextInt();
                    if (in_index<1 || in_index>index+1){
                        System.out.println("错误：超出索引范围");
                        break;
                    }
                    System.out.println("请输入插入数：");
                    int in_num = ss.nextInt();
                    int temp = a[in_index-1];
                    for (int i=in_index;i<index;i++){
                        int t = temp;
                        temp = a[i];
                        a[i] = t;
                    }
                    a[index] = temp;
                    a[in_index-1] = in_num;
                    index++;
                    break;
                case 2:
                    if (index<1){
                        System.out.println("错误：数组已空");
                        break;
                    }
                    System.out.println("请输入指定位置：");
                    in_index = ss.nextInt();
                    if (in_index<1 || in_index>index){
                        System.out.println("错误：超出索引范围");
                        break;
                    }
                    temp = a[index-1];
                    for (int i=index-2;i>=in_index;i--){
                        int t = temp;
                        temp = a[i];
                        a[i] = t;
                    }
                    a[in_index-1] = temp;
                    index--;
                    break;
                case 3:
                    bb = false;
                    break;
            }
        }
    }
}
