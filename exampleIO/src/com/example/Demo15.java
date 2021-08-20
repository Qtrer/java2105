package com.example;

import java.io.*;

//使用DataOutputStream向文件中输出int,double,String类型的数据
public class Demo15 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/output.txt");
        if (!file.exists()) file.createNewFile();
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeInt(100);
        dos.writeDouble(99.99);
        dos.writeUTF("hello world");
        dos.close();
    }
}
