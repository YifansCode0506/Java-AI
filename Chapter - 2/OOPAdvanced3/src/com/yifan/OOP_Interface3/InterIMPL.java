package com.yifan.OOP_Interface3;

public class InterIMPL extends Person implements Inter1, Inter2 {
    // 如果一个类实现了多个接口，那么就要重写多个接口中所有的抽象方法
    // 注意点：
        // 1. 如果父类Person也是一个抽象类的话，那么在子类中，需要把所有的抽象方法进行重写，要么子类本身也是一个抽象类
        // 2. 如果多个接口中出现了重复的方法，此时只需要重写一次就可以了


    @Override
    public void method1() {}
    @Override
    public void method2() {}

    @Override
    public void function1() {}
    @Override
    public void function2() {}

    @Override
    public void aaa() {}

    @Override
    public void bbb() {}

}
