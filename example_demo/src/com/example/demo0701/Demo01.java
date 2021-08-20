package com.example.demo0701;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {10, 90, 17, 35, 9, 66, 100, 3, 89, 6, 50};
        for (int i=0;i<arr.length;i++){
            int max = arr[i];
            int maxindex = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[j] > max){
                    max = arr[j];
                    maxindex = j;
                }
            }
            arr[maxindex] = arr[i];
            arr[i] = max;
        }
        for (int i:arr) System.out.println(i);
    }
}
