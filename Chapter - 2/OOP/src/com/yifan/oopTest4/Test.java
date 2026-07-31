package com.yifan.oopTest4;

public class Test {
    public static void main(String[] args) {
        Cook c =  new Cook();

        c.name = "Lo";
        c.age = 38;
        c.cookLevel = 10;

        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.cookLevel);
        c.cooking();
    }
}

