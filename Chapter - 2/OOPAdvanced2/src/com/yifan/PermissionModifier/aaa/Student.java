package com.yifan.PermissionModifier.aaa;

public class Student extends Person{

    // 本包中的其他类 (子类 + 无关类是一个逻辑)
    public void show() {
        System.out.println(name);
        super.test();
    }
}
