package com.yifan.OOP_Polymorphic3;

public class Test {
    public static void main(String[] args) {
      /*
    * 自行车Bicycle:
        属性:品牌，行驶速度
        行为:移动move，响铃ringBell()
    * 汽车car:
        属性:品牌，行驶速度
        行为:移动move，鸣笛honk()
    * 人Person:
        属性:名字，年龄，性别
        行为:行驶交通工具(能使用所有交通工具)

        测试类中创建Person的对象，让这个使用任意一款交通工具
    * */

        Person p = new Person("Lime", 25, "male");
        System.out.println(p.getName() + p.getAge() + p.getGender());

        Bicycle b = new Bicycle("Giant", 3);
        p.drive(b);
        Car c = new Car("Tesla", 60);
        p.drive(c);
    }


}
