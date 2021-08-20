package com.example;

import java.util.*;

public class Demo11 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "德国");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "德国");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "德国");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        Scanner ss = new Scanner(System.in);
        System.out.println("Input year:");
        int year = ss.nextInt();
        if (map.containsKey(year)){
            for (Integer i:map.keySet()){
                if (year == i) {
                    System.out.println(map.get(i));
                }
            }
        }
        else System.out.println("没有举办世界杯");
        System.out.println("------------------------------");
        System.out.println("Input winner:");
        String winner = ss.next();
        if (map.containsValue(winner)){
            List<Integer> keyList = new ArrayList<>();
            for (Integer i:map.keySet()){
                if (winner.equals(map.get(i))) keyList.add(i);
            }
            keyList.forEach(System.out::println);
        }
        else System.out.println("没有获得过世界杯");
    }
}
