package com.yifan.oopSet1;

public class Dog {
    // private 关键字表示只能当前类使用，其他类不可用
    private String name;
    private int age;

    // get/set
    // name
    // value:表示将来要赋的值 小白
    public void setName(String value) {
        // 给对象中的属性进行赋值
        name = value;
        // System.out.println(value);
    }
    public String getName() {
        return name;
    }

    // age
    // num:表示将来要赋的值 2岁
    public void setAge(int num) {
        // 给对象中的属性进行赋值
        if (num >= 0 && num <= 15) {
            age = num;
        }else{
            System.out.println("当前的" + num + "不在合理范围内");
        }

    }
    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println( age + "岁的，" + name + "正在吃骨头");
    }
}
