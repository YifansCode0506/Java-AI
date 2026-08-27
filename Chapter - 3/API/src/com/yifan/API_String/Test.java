package com.yifan.API_String;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 需求：查询API文档使用random中随机小数的方法

        // 1.创建random的对象
        Random r = new Random();
        // 2.调用方法获取一个随机小数[0.0 - 1.0)
        // 0.0 - 0.999999999999
        double num1 = r.nextDouble();
        System.out.println(num1);

        // [0.0 - 范围)
        // 0.0 - 1.899999999999
        double num2 = r.nextDouble(1.9);
        System.out.println(num2);

        // [1.5 - 2.69999999)
        double num3 = r.nextDouble(1.5, 2.7);
        System.out.println(num3);
    }
}
