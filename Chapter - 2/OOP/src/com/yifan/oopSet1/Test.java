package com.yifan.oopSet1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        // d.name = "Bai"; 这里会报错因为调用了带有private关键字的变量
        d.setName("Lo");
        d.setAge(5);
        d.eat();
    }
}
