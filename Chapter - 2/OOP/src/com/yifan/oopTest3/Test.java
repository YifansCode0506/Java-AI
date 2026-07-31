package com.yifan.oopTest3;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.name = "Li";
        t.age = 18;
        System.out.println(t.name);
        System.out.println(t.age);

        t.teach();
        t.eat();
        t.sleep();

    }
}
