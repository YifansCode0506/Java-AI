package com.yifan.Extends5;

public class Test {
    public static void main(String[] args) {
        /*
            某电商项目售卖智能设备，智能设备包括:手机，笔记本电脑，平板。
            1.所有的智能设备有以下属性:商品名，商品价格
            行为:计算商品总价格:
                [0 ~ 1000)元，不打折
                [1000 ~ 5000 )元.9折
                [5000 ~ 10000)元.8折
                10000元及以上，7折
            2.手机享受额外补贴，在原有的基础上基础打9折。
            3.笔记本电脑和平板电脑没有不享受额外补贴。
    * */

        // 创建三个子类的对象，并查看计算结果
        Phone p = new Phone();
        p.name = "Vivo";
        p.price = 1999;

        double payment = p.payment();
        System.out.println(p.name + ", " + p.price + ", " + payment);

        Laptop l = new Laptop();
        l.name = "DELL";
        l.price = 7999;
        double payment2 = l.payment();
        System.out.println(l.name + ", " + l.price + ", " + payment2);
    }


}
