package com.yifan.Extends6;

public class Teacher extends Person {
    String subject;

    // 空参构造
    public Teacher() {
        System.out.println("子类teacher的空参构造执行了");
    }

    // 带全部参数的构造(父 + 子)
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("子类teacher的带参构造执行了");
    }
}
