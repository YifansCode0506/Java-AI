package com.yifan.OOP_Polymorphic;

public class Students extends Person {
    public Students() {

    }

    public Students(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
