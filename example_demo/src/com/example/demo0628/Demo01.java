package com.example.demo0628;

public class Demo01 {
    public static void main(String[] args) {
        MyThread mm = new MyThread();
        Thread t1 = new Thread(mm,"window1");
        Thread t2 = new Thread(mm,"window2");
        Thread t3 = new Thread(mm,"window3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread implements Runnable{
    private static int num = 100;

    @Override
    public void run() {
        for (int i = num;i>0;i--){
            if (num <= 0){
                System.out.println(Thread.currentThread().getName() + ": " +"sold out!");
                break;
            }
            System.out.println(Thread.currentThread().getName() + ": " + num-- + " tickets left");
        }
    }
}
