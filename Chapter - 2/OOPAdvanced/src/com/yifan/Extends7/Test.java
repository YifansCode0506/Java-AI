package com.yifan.Extends7;

public class Test {
    public static void main(String[] args) {

        /*
        * 按照下面的需求书写一个JavaBean学生:
            属性:姓名、年龄
            当我们在学校里面不赛识一个同学的时候，都会称呼对方:同学
            所以现在认为学生的默认名字为:同学，默认年龄为18岁


            this():调用本类的其他构造方法
            细节：
                如果子类中有多个构造方法时，不能用this()互相调用，一定要预留一个去调用父类的构造方法
                如果构造方法中写上了 this(), 就不能再写 super(), JVM也不会自动添加 super();
        * */
        Student stu = new Student();
        // Student stu = new Student("同学", 23);
        // 使用 this() 后，调用空参构造，看到 this 后调用带参构造完成赋值
        System.out.println(stu.name + ", " + stu.age);
    }
}
