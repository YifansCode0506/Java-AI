package com.yifan.UI;

import com.yifan.domain.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    // 这个方法表示的就是登录注册的主页面(是以控制台的形式进行展示的)
    public void start() {
        System.out.println("游戏的登录注册页面打开了");

        ArrayList<User> list = new ArrayList<>();

        while(true) {
            System.out.println("==================");
            System.out.println("欢迎来到文字格斗游戏");
            System.out.println("==================");
            System.out.println("请选择操作：1登录 2注册 3退出");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> {
                    System.out.println("用户选择了退出操作");
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    // 登录操作
    public void login(ArrayList<User> list) {
        System.out.println("用户选择了登录操作");
    }

    // 注册操作
    public void register(ArrayList<User> list) {
        System.out.println("用户选择了登录操作");
    }

}
