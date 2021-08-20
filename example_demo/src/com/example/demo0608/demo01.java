package com.example.demo0608;

public class demo01 {
    public static void main(String[] args) {
        Person p = new Student();
//        p.name = "name";
//        p.age = 18;
//        p.sex = 'M';
//        p.sno = 123;
        p.setName("name");
        p.setAge(18);
        p.setSex('M');
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getSex());
        p.fun();
    }
}

class Person{
    private String name;
    private int age;
    private char sex;

    public Person(){

    }
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    void fun(){
        System.out.println("p.fun");
    }
}
class Student extends Person{
    private int sno;

    public Student(){

    }
    public Student(int sno){
        super();
        this.sno = sno;
    }
    public Student(String name, int age, char sex, int sno) {
        super(name, age, sex);
        this.sno = sno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    void fun(){
        System.out.println("s.fun");
    }
}
