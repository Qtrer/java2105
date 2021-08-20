package com.example.demo0618;

import java.awt.*;

public class MyList<T> {
    private Object[] objs;
    private int num = 0;

    public MyList() {
        this.objs = new Object[10];
    }

    public MyList(int i) {
        if (i>10) this.objs = new Object[i];
        else new MyList();
    }
    public void upload(){
        Object[] temp = new Object[2*this.objs.length];
        for (int i=0;i<this.objs.length;i++){
            temp[i] = this.objs[i];
        }
        this.objs = temp;
    }
    public void add(T t){
        if (num>=this.objs.length){
            upload();
        }
        this.objs[this.num++] = t;
    }
    public void add(int index, T t){
        if (index<0 || index>num){
            System.err.println("超出索引");
        }
        else {
            if (num>=this.objs.length){
                upload();
            }
            Object x = t;
            for (int i=index;i<=this.num;i++){
                Object temp = this.objs[i];
                this.objs[i] = x;
                x = temp;
            }
        }
    }
    public void remove(){
        Object[] temp = new Object[this.objs.length];
        for (int i=1,j=0;i<=this.num;i++,j++){
            temp[j] = this.objs[i];
        }
        this.objs = temp;
        this.num--;
    }
    public void remove(int index){
        if (index<0 || index>num){
            System.err.println("超出索引");
        }
        else {
            Object[] temp = new Object[this.objs.length];
            for (int i=0,j=0;i<=this.num;i++){
                if (i==index) continue;
                temp[j] = this.objs[i];
                j++;
            }
            this.objs = temp;
            this.num--;
        }
    }
    public T get(int index){
        T t = (T) this.objs[index];
        return t;
    }
    public int get(T t){
        int index = -1;
        for (int i=0;i<this.objs.length;i++){
            if (t == (T) this.objs[i]){
                index = i;
            }
        }
        return index;
    }
    public void set(int index, T t){
        this.objs[index] = t;
    }
    public void sout(){
        for (int i=0;i<=this.num;i++){
            if (this.objs[i]==null) break;
            System.out.println(this.objs[i]);
        }
    }
}
