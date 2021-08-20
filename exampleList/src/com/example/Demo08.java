package com.example;

import java.util.*;

public class Demo08 {
    public static void main(String[] args) {
        String[] color = {"♠", "♥", "♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        Poker[] pokers = new Poker[52];
        int i=0;
        for (String c:color){
            for (String n:number){
                pokers[i] = new Poker(c,n);
                i++;
            }
        }
        List<Poker> list = new ArrayList<>();
        list = Arrays.asList(pokers);
        Collections.shuffle(list);
        System.out.println("--------------------riffle--------------------");
        list.forEach(poker -> System.out.print(poker.getPoker()));
        System.out.println();
        list.sort(new PokerComparator());
        System.out.println("---------------------sort---------------------");
        list.forEach(poker -> System.out.print(poker.getPoker()));
    }
}
class Poker{
    private String color;
    private String number;

    public Poker(String color, String number) {
        this.color = color;
        this.number = number;
    }
    public String getPoker(){
        return this.color+this.number;
    }
}
class PokerComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Poker p1 = (Poker) o1;
        Poker p2 = (Poker) o2;
        int n1 = Integer.parseInt(numberCompare(p1.getPoker().substring(1)));
        int n2 = Integer.parseInt(numberCompare(p2.getPoker().substring(1)));
        if (n1 != n2) return n1-n2;
        else {
            String s1 = colorCompare(p1.getPoker().substring(0,1));
            String s2 = colorCompare(p2.getPoker().substring(0,1));
            return Integer.parseInt(s1)-Integer.parseInt(s2);
        }
    }
    private String numberCompare(String str){
        if (str.equals("J")) str = "11";
        if (str.equals("Q")) str = "12";
        if (str.equals("K")) str = "13";
        if (str.equals("A")) str = "14";
        if (str.equals("2")) str = "15";
        return str;
    }
    private String colorCompare(String str){
        if (str.equals("♠")) str = "1";
        if (str.equals("♥")) str = "2";
        if (str.equals("♦")) str = "3";
        if (str.equals("♣")) str = "4";
        return str;
    }
}
