package com.example;

public class Demo03 {
    public static void main(String[] args) {
        Hero hero = new Hero("skul");
        hero.show();
        Hero slime = new Hero("slime");
        hero.skillTo(slime, 1);
        hero.fightTo(slime);
    }
}
class Hero{
    private String name;
    private int health = 100;
    private static int level = 1;
    private int type;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int type) {
        this.type = type;
        if (type == 1){
            new Hero(name);
        }
        if (type == 2){
            this.name = name;
            this.health = 200;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        Hero.level = level;
    }

    public void show(){
        System.out.println("英雄名：" + name + " 等级：" + level + " 生命值：" + health);
    }
    public void fightTo(Hero hero){
        int heal = hero.getHealth();
        hero.setHealth(heal-100);
        System.out.println(hero.getName() + " dead!");
    }
    public int skill(int type){
        int damage = 0;
        if (type == 1) {
            System.out.println("use Q and cause 60 damage");damage = 60;}
        if (type == 2) {
            System.out.println("use W and cause 80 damage");damage = 80;}
        if (type == 3) {
            System.out.println("use E and cause 90 damage");damage = 90;}
        if (type == 4) {
            System.out.println("use R and cause 100 damage");damage = 100;}
        return damage;
    }
    public void skillTo(Hero hero, int skillType){
        int heal = hero.getHealth();
        hero.setHealth(heal-skill(skillType));
    }
}
