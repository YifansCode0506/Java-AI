package com.yifan.OOP_Polymorphic3;

public class Vehicle {
    // 属性:品牌，行驶速度
    // 行为:移动move
    private String brand;
    private double speed;

    public Vehicle() {

    }

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println(brand + "的交通工具正在以" + speed + "km/h 的速度移动");
    }


}
