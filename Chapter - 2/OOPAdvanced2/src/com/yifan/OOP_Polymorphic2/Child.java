package com.yifan.OOP_Polymorphic2;

public class Child extends Father {
    String name = "Child";

    public void childShow() {
        System.out.println("子类的childShow方法被调用了");
    }

    @Override
    public void show() {
        System.out.println("子类重写的show方法被调用了");
    }
}
