package com.example;

public class Demo07 {
    public static void main(String[] args) {
        Studen[] studens = new Studen[3];
        studens[0] = new Studen("q",88);
        studens[1] = new Studen("w",93);
        studens[2] = new Studen("e",81);
        for (Studen s:studens){
            s.disp();
        }
    }
}
class Studen{
    private int no;
    private String name;
    private int deg;
    private static int ano = 1001;

    public Studen(String name, int deg) {
        this.no = AutoId();
        this.name = name;
        this.deg = deg;
    }
    public int AutoId(){
        return ano++;
    }
    public void disp(){
        if (this.deg <= 89 && this.deg >= 80){
            System.out.println("No:" + this.no + " Name:" + this.name + " Deg:" + this.deg);
        }
    }
}
