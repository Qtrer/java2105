package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo13 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Stu("Tom", 18, 100, "class05"));
        list.add(new Stu("Jerry", 22, 70, "class04"));
        list.add(new Stu("Owen", 25, 90, "class05"));
        list.add(new Stu("Jim", 30,80 , "class05"));
        list.add(new Stu("Steve", 28, 66, "class06"));
        list.add(new Stu("Kevin", 24, 100, "class04"));
        double sum = 0;
        for (Object o:list){
            sum+=((Stu) o).getScore();
        }
        System.out.println("Ave: " + sum/list.size());
        Map<String, ArrayList> map = new HashMap<>();
        for (Object o:list){
            Stu s = (Stu) o;
            if (map.containsKey(s.getClassNum())){
                int classNum = (Integer)  map.get(s.getClassNum()).get(0);
                double classSum = (Double) map.get(s.getClassNum()).get(1);
                ArrayList arr = new ArrayList();
                arr.add(++classNum);
                arr.add(classSum+s.getScore());
                map.put(s.getClassNum(), arr);
            }
            else {
                ArrayList arr = new ArrayList();
                arr.add(1);
                arr.add(s.getScore());
                map.put(s.getClassNum(),arr);
            }
        }
        for (Map.Entry<String,ArrayList> m:map.entrySet()){
            System.out.println(m.getKey() + ": " + (m.getValue()).get(0) + " member, classAve: " + (Double)(m.getValue()).get(1)/(Integer)(m.getValue()).get(0));
        }
    }
}
class Stu{
    private String name;
    private int age;
    private double score;
    private String classNum;

    public Stu(String name, int age, double score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public double getScore() {
        return score;
    }

    public String getClassNum() {
        return classNum;
    }
}
