package com.yifan.oopThis;

public class This {
    private int age; // 成员变量

    public void setAge() {
        int age = 10; // 局部变量，如果注释掉则 为 0 0，因为第8行代码打印的是成员变量
        System.out.println(age); // 触发就近原则，打印的是局部变量 10
        System.out.println(this.age); // 有this前缀时打印成员变量age 成员变量没有在test赋值， 所以是 0
    }
}
