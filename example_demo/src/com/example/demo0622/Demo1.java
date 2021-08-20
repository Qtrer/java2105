package com.example.demo0622;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        String[] color = {"♠", "♥", "♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        List<String> strings = new ArrayList<>();
        for (String c:color){
            for (String n:number){
                strings.add(c+n);
            }
        }
        strings.add("JOKER");
        strings.add("joker");
        Collections.shuffle(strings);
        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        List<String> third = new ArrayList<>();
        int i=0;
        for (String s:strings){
            if (i == 51) break;
            if (i%3 == 0) first.add(s);
            if (i%3 == 1) second.add(s);
            if (i%3 == 2) third.add(s);
            i++;
        }
        System.out.println("--------------------first-----------------------");
        TreeSet<String> treeFirst = new TreeSet<>(new PokerComparator());
        treeFirst.addAll(first);
        for (String s:treeFirst){
            System.out.println(s);
        }
        System.out.println("--------------------second----------------------");
        TreeSet<String> treeSecond = new TreeSet<>(new PokerComparator());
        treeSecond.addAll(second);
        for (String s:treeSecond){
            System.out.println(s);
        }
        System.out.println("--------------------third-----------------------");
        TreeSet<String> treeThird = new TreeSet<>(new PokerComparator());
        treeThird.addAll(third);
        for (String s:treeThird){
            System.out.println(s);
        }
    }
}
class PokerComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.equals("JOKER")){
            return 1;
        }
        else if (o2.equals("JOKER")){
            return -1;
        }
        else if (o1.equals("joker")){
            return 1;
        }
        else if (o2.equals("joker")){
            return -1;
        }
        else {
            if (Integer.parseInt(PokerNumber(o1.substring(1))) > Integer.parseInt(PokerNumber(o2.substring(1)))) return 1;
            else if (Integer.parseInt(PokerNumber(o1.substring(1))) < Integer.parseInt(PokerNumber(o2.substring(1)))) return -1;
            else {
                if (Integer.parseInt(PokerColor(o1.substring(0,1))) > Integer.parseInt(PokerColor(o2.substring(0,1)))) return 1;
                else return -1;
            }
        }
    }
    public String PokerColor(String s){
        if (s.equals("♠")) s = "1";
        if (s.equals("♥")) s = "2";
        if (s.equals("♦")) s = "3";
        if (s.equals("♣")) s = "4";
        return s;
    }
    public String PokerNumber(String o1){
        if (o1.equals("2")) o1 = "15";
        if (o1.equals("A")) o1 = "14";
        if (o1.equals("K")) o1 = "13";
        if (o1.equals("Q")) o1 = "12";
        if (o1.equals("J")) o1 = "11";
        return o1;
    }
}
