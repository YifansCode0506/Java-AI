package com.yifan.FinalTest;

// 定义一个学生类，用来描述学生对象。
public class Student {
    // 学生姓名，只能在当前类中直接访问。
    private String name;
    // 学生年龄，只能在当前类中直接访问。
    private int age;

    // 无参构造方法：允许创建一个没有初始姓名和年龄的学生对象。
    public Student() {

    }

    // 有参构造方法：创建对象时，同时给姓名和年龄赋值。
    public Student(String name, int age) {
        // this.name 表示当前对象的 name 属性，右边的 name 是传入的参数。
        this.name = name;
        // this.age 表示当前对象的 age 属性，右边的 age 是传入的参数。
        this.age = age;
    }

    // 获取学生年龄。
    public int getAge() {
        return age;
    }

    // 修改学生年龄。
    public void setAge(int age) {
        this.age = age;
    }

    // 获取学生姓名。
    public String getName() {
        return name;
    }

    // 修改学生姓名。
    public void setName(String name) {
        this.name = name;
    }
}
