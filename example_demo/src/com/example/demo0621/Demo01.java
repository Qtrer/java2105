package com.example.demo0621;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Demo01 {
    public static void main(String[] args) {
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(34);
//        treeSet.add(24);
//        treeSet.add(57);
//        treeSet.add(81);
//        for (Integer i:treeSet){
//            System.out.println(i);
//        }
        TreeSet<Person> treeSet2 = new TreeSet<>(new PersonComparable());
        treeSet2.add(new Person("baa", 35));
        treeSet2.add(new Person("aab", 28));
        treeSet2.add(new Person("aba", 15));
        for (Person p : treeSet2){
            System.out.println(p);
        }
    }
}
class Person
//        implements Comparable<Person>
{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    @Override
//    public int compareTo(Person o) {
//        return Integer.compare(this.hashCode(), o.hashCode());
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class PersonComparable implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
