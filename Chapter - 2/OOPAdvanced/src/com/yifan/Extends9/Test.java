package com.yifan.Extends9;

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.name = "aaa";

        c.show();
    }
}


class Father {
    String name;
}

class Child extends Father {
    String name;

    public void show() {
        System.out.println(name + ", " + super.name);
    }
}