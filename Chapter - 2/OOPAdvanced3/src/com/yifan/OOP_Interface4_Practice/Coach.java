package com.yifan.OOP_Interface4_Practice;

public abstract class Coach extends Person{

    public Coach() {

    }

    public Coach(String name, int age) {
        super(name, age);
    }
    
    public abstract void teach();
}
