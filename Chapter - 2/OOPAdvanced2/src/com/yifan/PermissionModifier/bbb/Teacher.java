package com.yifan.PermissionModifier.bbb;

import com.yifan.PermissionModifier.aaa.Person;

// 不同包下的子类
public class Teacher extends Person {

    public void show() {
        System.out.println(name);
        super.test();
    }
}
