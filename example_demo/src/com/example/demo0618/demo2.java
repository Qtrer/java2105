package com.example.demo0618;

public class demo2 {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.sout();
        myList.add(1,100);
        myList.sout();
        myList.remove();
        myList.sout();
        myList.remove(1);
        myList.sout();
        Integer x = myList.get(1);
        System.out.println(x);
        myList.set(1, 200);
        myList.sout();
    }
}

