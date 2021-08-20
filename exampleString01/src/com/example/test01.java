package com.example;

public class test01 {
    public static void main(String[] args) {
        String str = "卡巴斯基#杀毒软件#免费版#俄罗斯#";
        String[] strings = str.split("#");
        for (String s: strings){
            System.out.println(s);
        }
    }
}
