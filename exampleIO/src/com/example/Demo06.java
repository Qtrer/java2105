package com.example;

import java.io.*;

//写一个方法,可以复制一个文件
public class Demo06 {
    public static void main(String[] args) throws IOException {
        File file = new File("f:/java/1.txt");
        copyfile(file,"f:/java/2.txt");
    }
    public static void copyfile(File file, String string) throws IOException {
        File tofile = new File(string);
        tofile.createNewFile();
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tofile));
        String str = null;
        while ((str = br.readLine()) != null){
            bw.write(str);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
