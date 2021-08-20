package com.example;

import java.io.*;
import java.util.Scanner;

//通过Scanner读两句话,并写到一个文件中.通过PrintWriter来实现
public class Demo13 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/output.txt");
        if (!file.exists()) file.createNewFile();
        Scanner ss = new Scanner(System.in);
        String str = ss.next();
        PrintStream pr = new PrintStream(file);
        pr.println(str);
        pr.close();
    }
}
