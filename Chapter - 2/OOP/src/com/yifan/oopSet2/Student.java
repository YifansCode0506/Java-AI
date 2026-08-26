package com.yifan.oopSet2;

public class Student {
    //姓名、年龄、身高、体重。
    private String name;
    private int age;
    private int height;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }

    public void study(){
        System.out.println(name + "正在学习");
    }
}
