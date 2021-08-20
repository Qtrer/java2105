package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo03 {
    public static void main(String[] args) {
        Integer[] ii = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        String[] str = {"科特迪瓦","阿根廷","澳大利亚","塞尔维亚","荷兰","尼日利亚","日本","美国","中国","新西兰","巴西","比利时","韩国","喀麦隆","洪都拉斯","意大利"};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(ii));
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        ArrayList<String> third = new ArrayList<>();
        ArrayList<String> forth = new ArrayList<>();
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i) %4 == 0) first.add(str[i]);
            if (arrayList.get(i) %4 == 1) second.add(str[i]);
            if (arrayList.get(i) %4 == 2) third.add(str[i]);
            if (arrayList.get(i) %4 == 3) forth.add(str[i]);
        }
        System.out.println("----------1----------");
        first.forEach(s -> System.out.println(s));
        System.out.println("----------2----------");
        second.forEach(s -> System.out.println(s));
        System.out.println("----------3----------");
        third.forEach(s -> System.out.println(s));
        System.out.println("----------4----------");
        forth.forEach(s -> System.out.println(s));
    }
}
