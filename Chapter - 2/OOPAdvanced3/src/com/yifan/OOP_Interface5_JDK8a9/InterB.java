package com.yifan.OOP_Interface5_JDK8a9;

public interface InterB {
    public default void function() {
        System.out.println("InterB 接口中新增的默认方法");
    }
}
