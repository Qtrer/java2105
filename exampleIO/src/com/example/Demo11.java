package com.example;

import java.io.*;

//使用FileWriter,向"f:/output" 输出一句话"hello world",并能过FileReader流读出这段文字
public class Demo11 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/output.txt");
        if (!file.exists()) file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write("hello world");
        fw.close();
        FileReader fr = new FileReader(file);
        char[] chars = new char[1024];
        fr.read(chars);
        System.out.println(new String(chars));
        fr.close();
    }
}
