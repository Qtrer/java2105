package com.example;

import java.io.File;
import java.io.IOException;

//使用File,获得一个文件是否存在,如果不存在,则创建.如果存在,则显示这个文件的大小,路径,最后修改时间
public class Demo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Qtrer\\Desktop\\6月酬金-1.xlsx");
        if (file.exists()){
            System.out.println(file.length());
            System.out.println(file.getPath());
            System.out.println(file.lastModified());
        }
        else {
            file.createNewFile();
        }
    }
}
