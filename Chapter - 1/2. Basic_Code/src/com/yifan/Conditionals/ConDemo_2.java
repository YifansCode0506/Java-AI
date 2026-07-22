package com.yifan.Conditionals;
import java.util.Scanner;

public class ConDemo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
        }

        int number = 3;
        switch (number) {
            case 1, 2, 3 -> System.out.println("-");
            case 4 -> System.out.println("四");
            case 5 -> System.out.println("五");
            default -> System.out.println("没有这个星期");
        }

        int number2 = 8;
        String name = switch (number2) {
            case 6, 7, 8 -> "二";
            case 9, 10, 11 -> "三";
            case 1, 2, 3, 4, 5 -> "-";
            default -> "没有这个星期";
        };
        // 如果下面，我要继续使用switch的结果
        System.out.println(name);


        // 练习:
        // 利用switch模拟计算器
        int a = 10;
        int b = 20;
        String operator = "*";

        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.println(result);
    }
}