package com.yifan.PermissionModifier.bbb;

import com.yifan.PermissionModifier.aaa.Person;

// 不同包下的无关类
public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        System.out.println(p.name);
        p.test();
    }
}
