package com.yifan.OOP_Interface;

public class Dog extends Animal implements Swim{

    public Dog() {

    }

    public Dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void eat() {
        System.out.println("the dog is eating bones");
    }

    @Override
    public void swim() {
        System.out.println("the dog is swimming");
    }

}
