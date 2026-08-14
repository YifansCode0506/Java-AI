package com.yifan.PermissionModifier.aaa;

public class Person {
    public String name;
    //  private String name; 用 private 修饰的只能在本类使用，只能 Person.java 中使用
    // String name; 默认权限修饰符只能在本宝使用，bbb目录下报错
    // protected String name; 用 protected 修饰的，不同包下的无关类会报错，也就是bbb下的test不能使用
    

    public void test() {
        System.out.println("父类test方法");
    }

    // 同一个类中

    public void show() {
        System.out.println(name);
        test();
    }
}
