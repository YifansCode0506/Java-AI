package com.yifan.oopTest1;

public class Test {
    public static void main(String[] args) {
        // 创建对象，记录第一只小狗的信息
        //格式:
        //类名 对象名 = new 类名();
        Dog d1 = new Dog();
        d1.name = "小白";
        d1.age = 13;
        d1.weight = 1.5;
        d1.color = "白色";

        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);
        System.out.println( );

        Dog d2 = new Dog();
        d2.name = "小黑";
        d2.age = 3;
        d2.weight = 2.5;
        d2.color = "黑色";

        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.weight);
        System.out.println(d2.color);
    }


}
