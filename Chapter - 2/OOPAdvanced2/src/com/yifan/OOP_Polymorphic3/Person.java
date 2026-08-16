package com.yifan.OOP_Polymorphic3;

public class Person {
    // 属性:名字，年龄，性别
    // 行为:行驶交通工具(能使用所有交通工具)

    private String name;
    private int age;
    private String gender;

    public Person() {

    }


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void drive(Vehicle vehicle) {

        vehicle.move();

        // 判断传递过来的是否是自行车
        if(vehicle instanceof Bicycle) {
            Bicycle b = (Bicycle) vehicle;
            b.ringbell();
        }else if(vehicle instanceof Car) {
            Car c = (Car) vehicle;
            c.honk();
        }else {
            System.out.println("没有这个类型");
        }
    }
}
