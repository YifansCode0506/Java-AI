package com.yifan.Extends8;

public class Test {
    public static void main(String[] args) {
        /*
        * 本科学生:
            属性:姓名、年龄、年级
            行为:吃饭、睡觉、学习(攻读学士学位)

        * 专业课老师:
            属性:姓名、年龄、学科
            行为:吃饭、睡觉、教书(教专业课知识)

        * 硕士研究生:
            属性:姓名、年龄、年级
            行为:吃饭、睡觉、学习(攻读硕士学位)

        * 通识课老师:
            属性:姓名、年龄
            行为:吃饭、睡觉、教书(教通识课知识)

            过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉
        * */

        Bachelor bs = new Bachelor("Kevin", 23, "Bachelor Degree");
        System.out.println(bs.getName() + ", " + bs.getAge() + ", " + bs.getGrade());
        bs.sleep();
        bs.eat();
        bs.study();

        System.out.println("---------------------------------------------------");
        Master ms = new Master("Jon", 25, "Master Degree");
        System.out.println(ms.getName() + ", " + ms.getAge() + ", " + ms.getGrade());
        ms.sleep();
        ms.eat();
        ms.study();

        System.out.println("---------------------------------------------------");
        MajorTeacher mj = new MajorTeacher("Diana", 35, "Major teacher");
        System.out.println(mj.getName() + ", " + mj.getAge() + ", " + mj.getSubject());
        mj.sleep();
        mj.eat();
        mj.teach();

        System.out.println("---------------------------------------------------");
        GeneralTeacher gj = new GeneralTeacher("Joseph", 45, "General Teacher");
        System.out.println(gj.getName() + ", " + gj.getAge() + ", " + gj.getSubject());
        gj.sleep();
        gj.eat();
        gj.teach();

    }
}
