package com.example.demo0719;

import java.lang.reflect.*;

public class Demo01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;
//        Constructor con = clazz.getConstructor(Integer.class, String.class, Integer.class, char.class);
//        Constructor[] cons = clazz.getDeclaredConstructors();
//        Object obj = con.newInstance(1,"q",18,'M');
//        System.out.println(obj);
        Method method = clazz.getMethod("personString", Integer.class, String.class, Integer.class, char.class);
        Method[] methods = clazz.getDeclaredMethods();
//        System.out.println(method.getName());
//        System.out.println(Modifier.toString(method.getModifiers()));
//        System.out.println(method.getReturnType().getSimpleName());
        Parameter[] parameters = method.getParameters();
//        for (Parameter p:parameters){
//            System.out.println(p.getName()+p.getType().getSimpleName());
//        }
//        System.out.println(method.invoke(obj,1,"q",18,'M'));
//        System.out.println("-----------------------------------------");
        StringBuffer str = new StringBuffer();
        str.append(Modifier.toString(method.getModifiers())).append(" ")
                .append(method.getReturnType().getSimpleName()).append(" ")
                .append(method.getName()).append("(");
        StringBuffer str1 = new StringBuffer();
        str1.append("\treturn ");
        for (int i=0;i<parameters.length;i++){
            str.append(parameters[i].getType().getSimpleName()).append(" ").append(parameters[i].getName());
            str1.append(parameters[i].getName());
            if (i == parameters.length-1) {
                str.append("){\n");
                str1.append(";\n}");
            }
            else {
                str.append(", ");
                str1.append("+\" \"+");
            }
        }
        str.append(str1);
        System.out.println(str);

    }
}
class Person{
    private Integer id;
    public String name;
    private Integer age;
    public char sex;

    public Person() {
    }

    public Person(Integer id, String name, Integer age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private Person(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private Person(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String personString(Integer id, String name, Integer age, char sex){
        return id+" "+name+" "+age+" "+sex;
    }
}
