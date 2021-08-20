package com.example;

import java.util.*;

public class Demo12 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");
        map.put("Allen","JDBC");
        map.put("Lucy","CoreJava");
        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String, String> m:set){
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        List<String> keyList = new ArrayList<>();
        for (String s:map.keySet()){
            if ("JSP".equals(map.get(s))) keyList.add(s);
        }
        keyList.forEach(System.out::println);
    }
}
