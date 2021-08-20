package com.example;

public class test05 {
    public final static float PI = (float)3.14;
    public static void main(String[] args) {
        int r = 3;
        System.out.println("周长为：" + (2*PI*r));
        System.out.println("面积为：" + (PI*r*r));
        System.out.println("表面积为：" + (4*PI*r*r));
        System.out.println("体积为：" + (4/3.0*PI*r*r*r));
    }
}
