package com.yifan.StaticVariableTest1;

public class Student {
    // 共享
    String name; //姓名
    int age; // 年龄

    // 一个班级的学生共享一个老师
    static String teacherName; // 老师的年龄
    // 未用 static 时 stu2.teacherName 是 null
    // 用 static 之后是 小雯老师
}
