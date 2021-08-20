package com.example;

public class Demo01 {
    public static void main(String[] args) {
        Student student = new Student("laner",2,'F',80,90,100,90,80);
        System.out.println(student.ave());
    }
}
class Person{
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
class Student extends Person{
    private int course1;
    private int course2;
    private int course3;
    private int course4;
    private int course5;

    public Student(String name, int age, char sex, int course1, int course2, int course3, int course4, int course5) {
        super(name, age, sex);
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
        this.course5 = course5;
    }
    public double ave(){
        return (course1+course2+course3+course4+course5)/5.0;
    }
}
