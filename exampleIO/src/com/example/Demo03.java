package com.example;

import java.io.File;

//创建一个多层目录 "f:/java/java1/java2"
public class Demo03 {
    public static void main(String[] args) {
        File file = new File("F:/java/java1/java2");
        file.mkdirs();
    }
}
