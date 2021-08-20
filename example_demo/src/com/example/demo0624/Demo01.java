package com.example.demo0624;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        Map<String, String> accounts = new HashMap<>();
        File accountFile = new File("F:\\Acadamic\\Java test\\workspace\\Java2105\\example_demo\\src\\com\\example\\demo0624\\account.txt");
        FileInputStream fis = new FileInputStream(accountFile);
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = new byte[16];
        int len = -1;
        while ((len = (fis.read(bytes))) != -1) {
            stringBuffer.append(new String(bytes, 0, len));
            String[] info = stringBuffer.toString().split("\n");
            for (String s:info){
                String[] ss = s.split("=");
                accounts.put(ss[0].trim(),ss[1].trim());
            }
        }
        fis.close();
        boolean mainMenu = true;
        Scanner ss = new Scanner(System.in);
        while (mainMenu){
            System.out.println("1.注册    2.登录    3.退出");
            int num = ss.nextInt();
            switch (num){
                case 1:
                    System.out.println("Please input your account:");
                    String account = ss.next();
                    System.out.println("Please input your password:");
                    String password = ss.next();
                    if (accounts.containsKey(account)){
                        System.out.println("Account exist!");
                        break;
                    }
                    accounts.put(account,password);
                    break;
                case 2:
                    System.out.println("Please input your account:");
                    account = ss.next();
                    System.out.println("Please input your password:");
                    password = ss.next();
                    if (accounts.containsKey(account)){
                        if (accounts.get(account).equals(password)){
                            System.out.println("Login Success!");
                            break;
                        }
                        else {
                            System.out.println("Password Error!");
                            break;
                        }
                    }
                    else {
                        System.out.println("Account invalid!");
                        break;
                    }
                case 3:
                    FileOutputStream fos = new FileOutputStream("F:\\Acadamic\\Java test\\workspace\\Java2105\\example_demo\\src\\com\\example\\demo0624\\account.txt");
                    Set<Map.Entry<String,String>> set = accounts.entrySet();
                    for (Map.Entry<String, String> m:set){
                        fos.write((m.getKey() + "=" + m.getValue() + "\n").getBytes());
                    }
                    fos.close();
                    mainMenu = false;
                    break;
            }
        }
    }
}
