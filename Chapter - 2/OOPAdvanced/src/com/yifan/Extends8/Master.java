package com.yifan.Extends8;

public class Master extends Students {
    public Master() {
    }

    public Master(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("studying master courses");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping in advanced dorm");
    }
}
