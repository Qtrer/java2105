package com.example;

import java.io.*;

//使用BufferedWriter,向"f:/output" 输出一句话"hello world",并能过BufferedReader,流读出这段文字
public class Demo14 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/output.txt");
        if (!file.exists()) file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("hello world");
        bw.close();
        BufferedReader br =new BufferedReader(new FileReader(file));
        String str = br.readLine();
        System.out.println(str);
        br.close();
    }
}
