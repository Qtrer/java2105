package com.example.demo0716;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Class c1 = Person.class;
        Person p = new Person();
        Class c2 = p.getClass();
        Class c3 = Class.forName("com.example.demo0716.Person");
        System.out.println(c1.getName());
        System.out.println(c2.getSimpleName());
        System.out.println(int[].class.getComponentType());
        Field f1 = c1.getField("name");
        Field[] fs1 = c1.getFields();
        Field f2 = c1.getDeclaredField("sex");
        Field[] fs2 = c1.getDeclaredFields();
        System.out.println(Modifier.toString(f1.getModifiers()));
        f1.set(p,"qtrer");
        f2.setAccessible(true);
        f2.set(p,'M');
        System.out.println(f2.get(p));
        System.out.println(p);
    }
}
class Person{
    private int id;
    public String name;
    private int age;
    public char sex;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
