package com.example.demo0615;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("The first num:");
        int a = ss.nextInt();
        System.out.println("The second num:");
        int b = ss.nextInt();
        int result = 0;
        try {
            result = dividend(a, b);
            System.out.println(result);
        }catch (MyException e){
            System.err.println(e.getMessage());
        }catch (ArithmeticException e){
            System.err.println("除数不能为0");
        }
    }
    public static int dividend(int a, int b) throws MyException, ArithmeticException{
        if (a<0) throw new MyException("被除数不能为负数", a);
        if (b<0) throw new MyException("除数不能为负数", b);
        int c = a/b;
        return c;
    }
}
class MyException extends Exception{
    private int num;

    public MyException(String message, int num) {
        super(message);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}