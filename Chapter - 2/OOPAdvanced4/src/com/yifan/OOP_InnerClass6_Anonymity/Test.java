package com.yifan.OOP_InnerClass6_Anonymity;

public class Test {
    public static void main(String[] args) {
        /*
            // 要求：在测试类中调用下面的goswimming方法

            // 传统调用方法
            // 1. 新建java文件，在文件中建立Student类(实现，重写方法)
            // 2. 创建学生对象
            // 创建学生对象
            Student s = new Student();
            // 调用方法
            goSwimming(s);

            // 问题：
                // 如果Student类只用一次，那么新建一个java文件有点浪费资源
                // 是否可以只要代码，不创建新的java文件呢
                // 匿名内部类的作用：少定义一个java文件

            匿名内部类的定义格式：
                new 类名/接口名(){
                    重写类/接口里面的方法
                }
            匿名内部类的定义格式 = 没有名字的java类 + 继承/实现 + 重写方法 + 创建对象
            最终格式可以理解为：一个没有名字的java类的对象

            没有名字的java类：大括号
            Swim: 就是这个没有名字的java类实现了swim接口
            重写方法：就是在大括号当中重写swim所有的抽象方法

        * */
//        写法1：
        goSwimming(new Swim(){
            @Override
            public void swim() {
                System.out.println("student is swimming");
            }
//            @Override
//            public void aaa() {
//                System.out.println("student is aaaing");
//            }
//            @Override
//            public void bbb() {
//                System.out.println("student is bbbing");
//            }
        });

        // 多态
        Swim ss = new Student();

        // 多态
        Swim swim = new Swim(){
            @Override
            public void swim() {
                System.out.println("student is swimming");
            }
//            @Override
//            public void aaa() {
//                System.out.println("student is aaaing");
//            }
//            @Override
//            public void bbb() {
//                System.out.println("student is bbbing");
//            }
        };

        goSwimming(swim);

    }


    // 调用这个方法的时候，需要传递Swim这个接口的实现类对象
    public static void goSwimming(Swim s) {
        s.swim();
    }
}
