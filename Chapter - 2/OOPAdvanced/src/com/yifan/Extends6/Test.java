package com.yifan.Extends6;

public class Test {
    public static void main(String[] args) {
        /*
        * 根据下面的描述定义继承结构
            学生:
                属性:姓名、年龄、年级
            老师:
                属性:姓名、年龄、学科

        * 继承结构当中构造方法的小细节:
            1.子类构造方法第一行，有一个默认的super()，如果我们没有书写，JVM也会自动加上
            2.如果想要访问父类的带参构造，super(参数)必须手动写上，不能省略
            3.在创建对象的时候，先执行父类的构造方法，再执行子类的构造方法
        * */

        // 创建对象
        Student stu = new Student("张三", 23, "研一");
        System.out.println(stu.name + ", " + stu.age + ", " + stu.grade);
    }
}
