package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss("Boss", 500, 200, new Weapon("Tank","Super machine"){});
        System.out.println(boss.getInfo());
    }
}
