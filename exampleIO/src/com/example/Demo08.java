package com.example;

import java.io.File;

//写一个方法,可以将一个非空目录中的所有文件的层次显示出来
public class Demo08 {
    public static void main(String[] args) {
        File file = new File("F:/java");
        soutdir(file);
    }
    public static void soutdir(File file){
        File[] files = file.listFiles();
        for (File f:files){
            if (f.isDirectory()) soutdir(f);
            if (f.isFile()) System.out.println(f.getAbsolutePath());
        }
    }
}
