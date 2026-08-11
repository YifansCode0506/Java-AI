package com.yifan.Extends;

public class Teacher extends Person {
    // 加入 extends ... 就可以使用父类 Person 的内容
    // 子类特有的内容
    // 属性：学科
    String subject;

    public void teach() {
        System.out.println("老师在教书");
    }
}
