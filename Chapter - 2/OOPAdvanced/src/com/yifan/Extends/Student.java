package com.yifan.Extends;

public class Student extends Person{
    // 加入 extends ... 就可以使用父类 Person 的内容
    // 子类特有的内容
    // 属性：学习
    String grade;

    public void study() {
        System.out.println("学生在学习");
    }
}
