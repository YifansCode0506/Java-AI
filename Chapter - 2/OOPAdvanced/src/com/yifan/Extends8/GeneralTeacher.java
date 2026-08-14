package com.yifan.Extends8;

public class GeneralTeacher extends Teachers {
    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public GeneralTeacher() {
    }

    @Override
    public void teach() {
        System.out.println("teaching general courses");
    }
}
