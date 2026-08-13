package com.yifan.Extends7;

public class Student {
    String name; // String name = "同学";
    int age; // int age = 18

    public Student() {
        this("同学", 23);
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}
