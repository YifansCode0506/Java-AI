package com.yifan.OOP_InnerClass2;

public class Outer {
    String name;


    private class Inner{}

    public class Inner2{}

    protected class Inner3{}

    public Inner getInstance(){
        return new Inner();
    }
}
