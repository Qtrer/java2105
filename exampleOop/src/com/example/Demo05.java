package com.example;

public class Demo05 {
    public static void main(String[] args) {
        Stud stud1 = new Stud("q",88);
        Stud stud2 = new Stud("w",64);
        Stud stud3 = new Stud("e",72);
        Stud stud4 = new Stud("r",94);
        Stud stud5 = new Stud("t",63);
        stud1.disp();
        System.out.println(Stud.ave());
    }
}
class Stud{
    private int no;
    private String name;
    private int deg;
    private static int ano = 1001;
    private static double sum = 0;
    private static int num = 0;

    public Stud(String name, int deg) {
        this.no = AutoId();
        this.name = name;
        this.deg = deg;
        sum+=deg;
        num++;
    }
    public int AutoId(){
        return ano++;
    }
    public void disp(){
        System.out.println("No:" + this.no + " Name:" + this.name + " Deg:" + this.deg);
    }
    public static double ave(){
        return sum/num;
    }
}
