package com.example;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String str = ss.next();
        if (str.length() == 15){
            if (str.charAt(14)%2 == 0) System.out.println("female");
            else System.out.println("male");
        }
        else if (str.length() == 18){
            if (str.charAt(16)%2 == 0) System.out.println("female");
            else System.out.println("male");
        }
        else System.out.println("error");
    }
}
