package com.yifan.OOP_Polymorphic;

public class Test {

    public static void main(String[] args) {
        /*
    * 学生类:
            属性: 姓名，账号，密码
            行为: work:学生的工作是学习
        *
    * 老师类:
            属性: 姓名，账号，密码
            行为: work:老师的工作是教书
        *
    * 管理员:
            属性: 姓名，账号，密码
            行为: work:管理员的工作是管理网站
        *
    * 学生管理系统:
            行为: 注册register
            要求: 能注册所有的角色
            输出: 姓名为张三的同学注册成功，账号zhangsan，密码123456
    * */
        // 创建一个学生对象
        Students stu = new Students("Kevin", "KK", "123456");

        // 创建学生管理系统的对象
        StudentManager sm = new StudentManager();
        // 把 stu 注册到学生管理系统当中
        sm.register(stu);

        // 创建一个老师的对象
        Teacher t = new Teacher("Li", "Li", "123456");
        sm.register(t);

    }
}
