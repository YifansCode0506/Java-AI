package com.yifan.Extends8;

public class Bachelor extends Students {
    // 私有化成员变量 不写 没有独有的

    // 空参构造
    // 带全部参数的构造 (间接父类 + 直接父类 + 自己)


    public Bachelor() {
    }

    public Bachelor(String name, int age, String grade) {
        super(name, age, grade);
    }

    // 重写学习方法

    @Override
    public void study() {
        System.out.println("studying bachelor courses");
    }
}
