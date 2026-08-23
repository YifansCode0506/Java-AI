package com.yifan.OOP_Interface5_JDK8a9;

public interface InterA {

    public abstract void method1();
    public abstract void method2();

    // 新增默认方法
    // public default 返回值类型 (方法名 形参) {方法体}
    public default void function() {
        System.out.println("InterA 接口中新增的默认方法");
    }
}
