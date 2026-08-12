package com.yifan.Extends2;

public class Test {
    public static void main(String[] args) {
        /*
            现在有三个电子设备，请设计他们的继承结构
            安卓手机:
                属性: 品牌，价格，
                行为: 打电话，发短信，nfc功能
            苹果手机:
                属性: 品牌，价格
                行为: 打电话，发短信
            笔记本电脑:
                行为:编程
                属性:品牌，价格
            画图:从下往上
            写代码:从上往下
        */

        // 创建安卓手机的对象
        Android a =  new Android();
        a.brand = "Vivo";
        a.price = 2999;
        System.out.println(a.brand + ", " + a.price);
        a.call();
        a.sendMessage();
        a.NFC();

        System.out.println();

        // 创建苹果手机的对象
        IOS io = new IOS();
        io.brand = "IPhone";
        io.price = 5999;
        System.out.println(io.brand + ", " + io.price);
        io.call();
        io.sendMessage();

        System.out.println();

        // 创建笔记本电脑的对象
        Laptop l = new Laptop();
        l.brand = "DELL";
        l.price = 7999;
        System.out.println(l.brand + ", " + l.price);
        l.programming();
    }
}
