package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer[] ii = {1,2,3,4,5,6,7,8,9,10};
        arrayList.addAll(Arrays.asList(ii));
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);
    }
}
