package com.example;

public class Demo09 {
    public static void main(String[] args) {
        DicItem[] dicItems = new DicItem[3];
        dicItems[0] = new DicItem("red","红色");
        dicItems[1] = new DicItem("blue","蓝色");
        dicItems[2] = new DicItem("green","绿色");
        Dic dic = new Dic(dicItems);
        dic.Add(new DicItem("yellow","黄色"));
        System.out.println(dic.trans("red"));
    }
}
class Dic{
     private DicItem[] dicItems;

    public Dic(DicItem[] dicItems) {
        this.dicItems = dicItems;
    }
    public void Add(DicItem dicItem){
        DicItem[] temp = new DicItem[this.dicItems.length+1];
        for (int i=0;i<this.dicItems.length;i++){
            temp[i] = this.dicItems[i];
        }
        temp[this.dicItems.length] = dicItem;
        this.dicItems = temp;
    }
    public String trans(String str){
        for (DicItem d:this.dicItems){
            if (d.getEnglish().equals(str)) return d.getChinese();
        }
        return null;
    }
}
class DicItem{
    private String English;
    private String Chinese;

    public DicItem(String english, String chinese) {
        English = english;
        Chinese = chinese;
    }

    public String getEnglish() {
        return English;
    }

    public String getChinese() {
        return Chinese;
    }
}
