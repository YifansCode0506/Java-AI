package com.yifan.OOP_InterClass3;

public class Test {
    public static void main(String[] args) {

        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
