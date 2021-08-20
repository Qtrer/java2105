package com.example;

public class Demo09 {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i=1;i<11;i++) dynamicArray.add(i);
        dynamicArray.add(4,100);
        for (int i=0;i<dynamicArray.length();i++) System.out.println(dynamicArray.get(i));
        dynamicArray.remove(2);
        System.out.println();
        for (int i=0;i<dynamicArray.length();i++) System.out.println(dynamicArray.get(i));
        dynamicArray.set(7, 200);
        for (int i=0;i<dynamicArray.length();i++) System.out.println(dynamicArray.get(i));
        System.out.println(dynamicArray.contain(9));
        System.out.println(dynamicArray.contain(11));
    }
}
class DynamicArray{
    private Object[] objs;
    private int num = 0;

    public DynamicArray() {
        this.objs = new Object[10];
    }
    public DynamicArray(int length) {
        if (length>10) this.objs = new Object[length];
        else new DynamicArray();
    }
    public int length(){
        return this.num+1;
    }

    public void upload(){
        Object[] temp = new Object[2*this.objs.length];
        for (int i=0;i<this.objs.length;i++){
            temp[i] = this.objs[i];
        }
        this.objs = temp;
    }
    public void add(Object obj) {
        if (num>=this.objs.length){
            upload();
        }
        this.objs[this.num++] = obj;
    }
    public void add(int index,Object obj) {
        if (index<0 || index>num){
            System.err.println("超出索引");
        }
        else {
            if (num>=this.objs.length){
                upload();
            }
            for (int i=index;i<=this.num;i++){
                Object temp = this.objs[i];
                this.objs[i] = obj;
                obj = temp;
            }
        }
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
    public Object get(int index) {
        return this.objs[index];
    }
    public void set(int index,Object obj) {
        this.objs[index] = obj;
    }
    public boolean contain(Object obj) {
        for (Object o:this.objs){
            if (obj.equals(o)) return true;
        }
        return false;
    }
}
