package com.yifan.oopSet3;

public class Student {
    //姓名、年龄、身高、体重。
    private String name;
    private int age;
    private int height;
    private int weight;

    public void setName(String value) {
        name = value;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num) {
        age = num;
    }
    public int getAge(){
        return age;
    }

    public void setHeight(int num) {
        height = num;
    }
    public int getHeight(){
        return height;
    }

    public void setWeight(int num) {
        weight = num;
    }
    public int getWeight(){
        return weight;
    }

    public void study(){
        System.out.println(name + "正在学习");
    }
}
