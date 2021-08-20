package com.example;

public class test13 {
    public static void main(String[] args) {
        String str = "01#张三#20-02#李四#30-03#王五#40";
        String[] strings = str.split("-");
        int sum = 0;
        for (String st:strings){
            String[] strings1 = st.split("#");
            for (String s:strings1){
                System.out.print(s + "\t");
            }
            System.out.println("");
            sum+=Integer.parseInt(strings1[2]);
        }
        System.out.println((float) sum/strings.length);
    }
}
