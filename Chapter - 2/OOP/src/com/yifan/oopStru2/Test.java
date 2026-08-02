package com.yifan.oopStru2;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();

        stu1.setName("Ran");
        stu1.setAge(18);

        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        stu1.Study();
        stu1.Eat();
        stu1.Sleep();

        System.out.println();
        Student stu2 = new Student("Ran",27);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        stu2.Study();
        stu2.Eat();
        stu2.Sleep();
    }
}
