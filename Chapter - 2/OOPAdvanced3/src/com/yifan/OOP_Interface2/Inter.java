package com.yifan.OOP_Interface2;

public interface Inter {
    // 成员变量:只能是常量。默认修饰符:public static final
    int A = 10;

    // 构造方法:没有
    // 因为接口不能创建对象，而且接口里面所有的成员变量都是常量，已经有真实数据
    // public Inter() {}

    // 成员方法:只能是抽象方法。默认修饰符:public abstract --只适用于 jdk7及以前
    void method();

}
