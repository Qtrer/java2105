package com.example;

public class test04 {
    public static void main(String[] args) {
        int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count = 0;
        for (int i=0;i<oldArr.length;i++){
            if (oldArr[i] == 0){
                count++;
            }
        }
        int[] newArr = new int[oldArr.length-count];
        for (int i=0, j=0;i<newArr.length;i++, j++){
            while (oldArr[j] == 0){
                j++;
            }
            newArr[i] = oldArr[j];
            System.out.println(newArr[i]);
        }
    }
}
