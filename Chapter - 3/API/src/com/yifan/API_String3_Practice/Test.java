package com.yifan.API_String3_Practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
            boolean equals方法(要比较的字符) 完全一样结果才是true，否则为false

            boolean equalsIgnoreCase(要比较的字符串) 忽略大小写的比较
        * */

        // 字符串比较的两个方法
        // 第一个方法: equals 方法完全一致
        // String username = "abc";
        // String rightUsername = "abc"; // true
        // String RightUsername = "abc"; // false

        //　boolean b1 = username.equals(rightUsername);
        // System.out.println(b1);


        // 练习:
        //      已知正确的用户名和密码，请用程序实现模拟用户登录
        //      总共给三次机会，登录之后，给出相应的提示

        // 1.已知正确的用户名和密码
        String rightUsername = "abc";
        String rightPassword = "123456";

        // 2.让用户用键盘输入用户名和密码
        Scanner input = new Scanner(System.in);


        // 3. 比较
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = input.next();
            System.out.println("请输入密码");
            String password = input.next();

            boolean result = username.equals(rightUsername) && password.equals(rightPassword);
            if (result) {
                System.out.println("Login successes");
                // 登录成功跳出循环
                break;
            } else {
                if(i <= 2){
                    System.out.println("Login failed, you still have" + (3-i) +"chances");
                }else{
                    System.out.println("Login failed");
                }
            }
        }


        // System.out.println(result);

    }
}
