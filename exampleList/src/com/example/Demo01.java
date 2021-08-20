package com.example;

import java.util.LinkedList;

public class Demo01 {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student("刘德华",85));
        linkedList.add(new Student("张学友",100));
        linkedList.add(new Student("刘杰",65));
        linkedList.add(new Student("章子怡",58));
        linkedList.add(new Student("周迅",76));
        System.out.println(linkedList.size());
        Student stu = null;
        for (Student s:linkedList) {
            if ("刘杰".equals(s.getName())) stu = s;
        }
        linkedList.remove(stu);
        linkedList.forEach(student -> System.out.println(student));
        linkedList.forEach(s -> {if ("刘德华".equals(s.getName())) s.setDegree(95);});
        linkedList.forEach(s -> {if (s.getDegree() < 60) System.out.println(s.getName());});
        linkedList.forEach(student -> System.out.println(student));
    }
}
class Student{
     private String name;
     private int degree;

    public Student(String name, int degree) {
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "name:" + name  + " degree:" + degree;
    }
}
