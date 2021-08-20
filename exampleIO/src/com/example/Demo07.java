package com.example;

import java.io.File;
import java.io.IOException;

//写一个方法,可以复制一个目录,(此目录不为空)
public class Demo07 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/java");
        copydir(file,"F:/java1");
    }

    public static void copydir(File file, String string) throws IOException {
        File tofile = new File(string);
        if (!tofile.exists()) tofile.mkdirs();
        File[] files = file.listFiles();
        for (File f:files){
            String fromfilepath = file.getPath() + File.separator + f.getName();
            String tofilepath = tofile.getPath() + File.separator + f.getName();
            if (f.isDirectory()) copydir(new File(fromfilepath), tofilepath);
            if (f.isFile()) Demo06.copyfile(new File(fromfilepath), tofilepath);
        }
    }
}
