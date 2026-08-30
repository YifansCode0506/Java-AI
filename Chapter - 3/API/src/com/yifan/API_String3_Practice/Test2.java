package com.yifan.API_String3_Practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        * public char charAt(int index):根据索引返回字符
        * public int length():返回此字符串的长度
        *
        * 需求:键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        *
        * */

        // 1. chartAt
        String str = "Hello World";
        char c = str.charAt(0);
        System.out.println(c);

        // 2. length
        int len = str.length();
        System.out.println(len);

        // 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String s = sc.next();
        // for 快速生成：s.length().fori
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

    }
}
