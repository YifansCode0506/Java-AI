package com.yifan.OOP_Interface;

public class Test {
    public static void main(String[] args) {
        /*
        * 青蛙    属性：名字，颜色    行为：吃虫子，蛙泳
        * 狗      属性：名字，颜色    行为：吃骨头，狗刨
        * 兔子    属性：名字，颜色    行为：吃胡萝卜
        * */

        Frog f = new Frog("Frog", "green");
        System.out.println(f.getName() + ", " + f.getColor());
        f.eat();
        f.swim();

        System.out.println("--------------------------------");

        Rabbit r = new Rabbit("Rabbit", "white");
        System.out.println(r.getName() + ", " + r.getColor());
        r.eat();

        System.out.println("--------------------------------");

        Dog d = new Dog("Dog", "black");
        System.out.println(d.getName() + ", " + d.getColor());
        d.eat();
        d.swim();

    }
}
