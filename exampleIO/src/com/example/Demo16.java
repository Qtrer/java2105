package com.example;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//定义一个学生类 Student,有属性,Date birth,String name,int height,String degree,定义两个对象,将此对象写到文件中,并在另外一个工程中,将些内容读出
public class Demo16 {
    public static void main(String[] args) throws IOException, ParseException {
        Student stu1 = new Student("q",new Date(),180,"B");
        Student stu2 = new Student("l",new Date(),160,"A");
        File file = new File("F:/output.txt");
        if (!file.exists()) file.createNewFile();
//        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//        bw.write(stu1.toString());
//        bw.newLine();
//        bw.write(stu2.toString());
//        bw.close();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = null;
        str = br.readLine();
        String[] strings = str.split("\t");
        Date date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US).parse(strings[1]);
        Student stu3 = new Student(strings[0],date,Integer.parseInt(strings[2]),strings[3]);
        str = br.readLine();
        strings = str.split("\t");
        date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US).parse(strings[1]);
        Student stu4 = new Student(strings[0],date,Integer.parseInt(strings[2]),strings[3]);
        System.out.println(stu3);
        System.out.println(stu4);
        br.close();
    }
}
class Student{
    private String name;
    private Date birth;
    private int height;
    private String degree;

    public Student(String name, Date birth, int height, String degree) {
        this.name = name;
        this.birth = birth;
        this.height = height;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return name + '\t' + birth + '\t' + height + '\t' + degree;
    }
}
