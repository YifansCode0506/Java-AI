package com.yifan.OOP_Polymorphic;

public class StudentManager {

    // 定义一个方法表示注册用户
    // 参数是Person：此时可以传递的Person本身的对象，同时也可以传递Person所有子类的对象

    public void register(Person person){
        // 输出: 姓名为张三的同学注册成功，账号zhangsan，密码123456
        System.out.println("姓名为：" + person.getName() + "的账户注册成功，账号" + person.getUsername() + "，密码" + person.getPassword());
        person.work();
    }
}
