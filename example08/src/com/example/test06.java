package com.example;

public class test06 {
    public static void main(String[] args) {
        int[][] a = {{11, 15, 32, 21}, {2, 3}, {4, 5, 6}};
        int count = 0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                count++;
                System.out.print(a[i][j] + "\t");
            }
        }
        int[] b = new int[count];
        for (int i=0, c=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++, c++){
                b[c] = a[i][j];
            }
        }
        for (int i=0;i<b.length;i++){
            for (int j=i+1;j<b.length;j++){
                if (b[i]>b[j]){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println("\n排序结果：");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i] + "\t");
        }
    }
}
