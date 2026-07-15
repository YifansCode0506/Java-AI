package com.yifan.variable;

import java.util.Scanner;

public class VariableDemo_2 {
    public static void main(String[] args) {
        // 键盘录入
        // 找到scanner
        Scanner sc = new Scanner(System.in);
        // 执行scanner
        int num = sc.nextInt(); // 接收整数
        System.out.println(num);

        // 接收小数
        double num2 = sc.nextDouble();
        System.out.println(num2);

        // 接收文本
        String context = sc.next();
        System.out.println(context);
    }
}
