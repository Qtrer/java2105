package com.example;

import java.io.*;;

//使用FileOutputStream,向"f:/output" 输出一句话"hello world",并能过FileInputStream流读出这段文字
public class Demo10 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/output.txt");
        if (!file.exists()) file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("hello world".getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        fis.read(bytes);
        System.out.println(new String(bytes));
        fis.close();
    }
}
