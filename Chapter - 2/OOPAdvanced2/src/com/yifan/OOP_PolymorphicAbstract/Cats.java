package com.yifan.OOP_PolymorphicAbstract;

public class Cats extends Animal {
    // 猫类:
        // 属性:名字，颜色
        // 行为:猫吃鱼，猫抓老鼠，喝水
    public Cats() {

    }

    public Cats(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    public void catchMouse() {
        System.out.println("catch mouse");
    }
}
