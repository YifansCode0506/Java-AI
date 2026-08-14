package com.yifan.Extends8;

public class MajorTeacher extends Teachers {
    public MajorTeacher() {
    }

    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("teaching major courses");
    }
}
