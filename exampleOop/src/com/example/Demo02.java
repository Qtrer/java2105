package com.example;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.roll());
    }
}
class Dice{
    private static int plane=6;
    private static int point=6;
    private int score = new Random().nextInt(6)+1;
    public int roll(){
        return score;
    }

}
