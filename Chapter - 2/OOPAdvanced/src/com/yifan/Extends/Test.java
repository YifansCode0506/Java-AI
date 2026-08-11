package com.yifan.Extends;

public class Test {
    public static void main(String[] args) {
        // 创建学生对象
        Student s = new Student();
        s.name = "诗诗";
        s.age = 19;
        s.grade = "大二";

        System.out.println(s.name + "," + s.age + "," + s.grade);
        s.eat();
        s.study();

        System.out.println("----------");

        // 创建老师的对象
        Teacher t = new Teacher();
        t.name = "阿伟";
        t.age = 27;
        t.subject = "编程";
        System.out.println(t.name + "," + t.age +"," + t.subject);
        t.eat();
        t.teach();
    }
}
