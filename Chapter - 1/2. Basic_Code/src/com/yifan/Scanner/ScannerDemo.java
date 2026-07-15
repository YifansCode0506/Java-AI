package com.yifan.Scanner;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Keyboard input
        Scanner sc = new Scanner(System.in);

        // Read an integer
        int num = sc.nextInt();
        System.out.println(num);

        // Read a decimal number
        double num2 = sc.nextDouble();
        System.out.println(num2);

        // Read text
        String context = sc.next();
        System.out.println(context);

        sc.close();

        // 练习1:键盘录入一个整数，判断这个数字是否在1~10之间
        // 1.键盘录入一个整数
        Scanner scr = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = scr.nextInt();

        // 2.判断这个数字是否在1~10之间
        // number > 1 number < 10 同时满足 &
        boolean result = number > 1 && number < 10;
        System.out.println(result);
        scr.close();
    }
}
