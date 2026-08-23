package com.yifan.OOP_Interface5_JDK8a9;

public class InterAIMPL implements InterA {

    @Override
    public void method1() {
        System.out.println("实现类写的method1方法~");
    }

    @Override
    public void method2() {
        System.out.println("实现类写的method2方法~");
    }

    @Override
    public void function() {
        System.out.println("实现类重写了默认方法");
    }

}
