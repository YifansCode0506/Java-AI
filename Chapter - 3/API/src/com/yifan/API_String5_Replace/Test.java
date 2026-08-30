package com.yifan.API_String5_Replace;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        * String replace(旧值,新值) 替换
                注意点:只有返回值才是替换之后的结果
        * 需求:
                过滤玩游戏中骂人的脏话
        * */

//        String str = "you better uninstall you piece of shit";
//
//        // 替换
//        // 第一个参数:被替换的数据
//        // 第二个参数:用来菩换的数据
//        // 只有返回值才会菩换之后的结果
//        String r = str.replace("piece of shit", "****");
//        System.out.println(r);

        // 1. 创建一个敏感词库
        String[] arr = {"fucking", "fucker", "fuck", "shit"};

        // 2. 键盘录入内容
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter sentences:");
        String msg = scan.nextLine();

        // 3. 替换敏感词
        for (int i = 0; i < arr.length; i++) {
            msg = msg.replace(arr[i], "***");
        }
        System.out.println(msg);

    }
}
