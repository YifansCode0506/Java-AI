package com.yifan.OOP_PolymorphicAbstract;

public class Dogs extends Animal {
    // 狗类:
        // 属性:名字，颜色
        // 行为:狗吃骨头，狗看家
    public Dogs() {

    }

    public Dogs(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("eat bone");
    }

    public void LookAfterHome() {
        System.out.println("Look after home");
    }


}
