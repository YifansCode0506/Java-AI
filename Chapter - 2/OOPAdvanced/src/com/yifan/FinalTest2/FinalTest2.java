package com.yifan.FinalTest2;

public class FinalTest2 {
    public static void main(String[] args) {
        /*
        定义一个Javabean类描述圆
        属性:半径和圆周率
        行为:计算圆的面积和周长
        */

        // 创建一个圆的对象
        FinalCircle c = new FinalCircle(1.5);

        // 获取圆的属性
        System.out.println(c.getRadius());
        System.out.println(c.getPI());

        // 获取圆的面积
        System.out.println(c.getArea());

        // 获取圆的周长
        System.out.println(c.getPerimeter());
    }
}
