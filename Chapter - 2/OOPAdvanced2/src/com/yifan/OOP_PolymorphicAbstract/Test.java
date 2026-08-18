package com.yifan.OOP_PolymorphicAbstract;

public class Test {
    public static void main(String[] args) {
       /*
        抽象类和抽象方法就是为了当父类的“方法” 不能确定时，让子类能重写

        * Animal类 (抽象类):
            属性: 名字，颜色
            行为：eat() 该方法不能确定，猫狗不一样，用抽象方法

        * 猫类:
            属性:名字，颜色
            行为:猫吃鱼，猫抓老鼠，喝水 (行为不同)
        * 狗类:
            属性:名字，颜色
            行为:狗吃骨头，狗看家 (行为不同)
        *
        * -----------------------------------------------------
        * 注意点:
        * 1.抽象类不能实例化
            如果可以创建抽象类的对象的话，用对象调用一个没有方法体的抽象方法，没有任何意义。

        * 2.抽象类中不一定有抽象方法
            作用：不让外界创建本类对象

        * 有抽象方法的类一定是抽象类(可以是正常内容)

        * 3.抽象类中可以有构造方法
            作用：构造方法的作用是 初始化成员变量，也就是赋值
            创建对象是 new 关键字 Student stu = new Student();
                1. 加载字节码文件
                2. 在栈中申明局部变量stu
                3. 在堆里开辟一个小空间 (对象) name age
                4. 默认初始化
                5. 显示初始化
                6. 构造方法初始化
                7. 赋值地址

        * 4.抽象类的子类
            要么重写抽象类中的所有抽象方法 (正常方法)
            要么子类也是抽象类
                这种方式意义不大，还要再写一个继承类并重写抽象方法。
                在外界才可以创建继承类并调用，但抽象不能创建对象的
        *
        *
        * */

        Cats cats = new Cats("Meow", "White");
        System.out.println(cats.getName() + ", " + cats.getColor());
        cats.eat();
        cats.catchMouse();
        cats.drink();

        Dogs dogs = new Dogs("Bark", "Black");
        System.out.println(dogs.getName() + ", " + dogs.getColor());
        dogs.eat();
        dogs.LookAfterHome();
    }


}
