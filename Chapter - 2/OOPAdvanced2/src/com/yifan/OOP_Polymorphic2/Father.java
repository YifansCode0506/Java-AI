package com.yifan.OOP_Polymorphic2;

public class Father extends Grand {
    String name = "father";

    public void fatherShow() {
        System.out.println("父类的fatherShow方法被调用了");
    }

    public void show() {
        System.out.println("父类的show方法被调用了");
    }
}
