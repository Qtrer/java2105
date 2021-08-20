package com.example;

import java.io.File;
import java.io.IOException;

//File类,自学createTempFile方法的使用,在一个目录中，创建500个临时文件
public class Demo04 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/java/java1/java2");
        file.mkdirs();
        for (int i=0;i<500;i++) File.createTempFile("temp",".txt",file);
    }
}
