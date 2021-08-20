package com.example;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = ss.nextInt();
        int[][] a = new int[n][n];
        if (n == 1){
            a[0][0] = 1;
        }
        else if (n == 2){
            a[0][0] = a[1][0] = a[1][1] = 1;
        }
        else {
            a[0][0] = a[1][0] = a[1][1] = 1;
            for (int i=2;i<n;i++){
                for (int j=0;j<=i;j++){
                    if (j == 0 || j == i){
                        a[i][j] = 1;
                    }
                    else {
                        a[i][j] = a[i-1][j-1] + a[i-1][j];
                    }
                }
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<=i;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
