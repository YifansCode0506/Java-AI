package com.yifan.OOP_Interface;

public class Frog extends Animal implements Swim{

    public Frog() {}

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("the frog is swimming");
    }

    @Override
    public void eat() {
        System.out.println("the frog is eating insect");
    }
}
