package com.yifan.FinalTest2;

public class FinalCircle {
    private double radius;
    private final double PI = 3.14;

    // 构造方法
    public FinalCircle(){

    }
    public FinalCircle(double radius) {
        this.radius = radius;
    }

    // GET / SET

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    // 行为
    // 计算圆的面积
    public double getArea() {
        return PI * radius * radius;
    }

    // 计算圆的周长
    public double getPerimeter() {
        return 2 * PI * radius;
    }

}
