package com.yifan.OOP_Polymorphic3;

public class Car extends Vehicle {
    // 属性:品牌，行驶速度
    // 行为:移动move，鸣笛honk()


    public Car() {
        super();
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + "的汽车正在以" + getSpeed() + "km/h 的速度移动");
    }

    public void honk() {
        System.out.println("ba~ba~ba~");
    }
}
