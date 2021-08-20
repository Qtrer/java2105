package com.example;

import java.util.Random;

public class Demo08 {
    public static void main(String[] args) {
        Stu[] stus = new Stu[10];
        for (int i=0;i<stus.length;i++){
            stus[i] = new Stu(String.valueOf(i),new Random().nextInt(100)+1);
        }
        Compute compute = new Compute(stus);
        compute.sort();
        compute.disp();
    }
}
class Stu{
    private String name;
    private int deg;
    private String flag = "PASS";
    public static int num = 0;

    public Stu(String name, int deg) {
        this.name = name;
        this.deg = deg;
        num++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
class Compute{
    private Stu[] stus;

    public Compute(Stu[] stus) {
        this.stus = stus;
    }
    public void sort(){
        for (int i=0;i<stus.length;i++){
            for (int j=i;j<stus.length;j++){
                if (stus[i].getDeg() < stus[j].getDeg()){
                    Stu temp = stus[i];
                    stus[i] = stus[j];
                    stus[j] = temp;
                }
            }
        }
        for (int i=0;i<stus.length;i++){
            if (i >=  0.7*stus.length) stus[i].setFlag("FAIL");
        }
        System.out.println("sort completed");
    }
    public void disp(){
        for (Stu s:stus){
            System.out.println("Name:" + s.getName() + " Deg:" + s.getDeg() + " Flag:" +s.getFlag());
        }
    }
}
