package com.example;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo04 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=1;i<16;i++){
            linkedList.add(i);
        }
        int num = 0;
        while (linkedList.size() > 1){
            for (int i=0;i<linkedList.size();i++){
                num++;
                if (num == 7){
                    linkedList.remove(i);
                    num = 1;
                    if (i == linkedList.size()) num = 0;
                }
            }
        }
        System.out.println(linkedList.get(0));
    }
}