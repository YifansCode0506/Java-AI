package com.yifan.Extends3;

public class Test2 {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.ziShow();
    }
}

class Fu1 {
    String name = "Fu";
    String address = "南京";
}

class Zi1 extends Fu1 {
    String name = "Zi";

    public void ziShow() {
        System.out.println(name);
        System.out.println(this.name);

        System.out.println(super.name);
        System.out.println(address); // 从局部位置往上找 (ziShow -> Zi1 -> Fu1 -> address)
        System.out.println(this.address); // 从本类成员位置往上找 (Zi1 -> Fu1 -> address)
        System.out.println(super.address); // 从父类成员位置往上找 (Fu1 -> address)
    }
}