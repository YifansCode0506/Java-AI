package com.yifan.variable;

public class Scanner {
    public static void main(String[] args) {
        try (// 键盘录入
                // 找到scanner
        java.util.Scanner sc = new java.util.Scanner(System.in)) {
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
}
