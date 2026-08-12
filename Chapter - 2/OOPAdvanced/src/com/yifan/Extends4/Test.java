package com.yifan.Extends4;

public class Test {
    public static void main(String[] args) {
        /*
            第一代手机:
                功能: 打电话
            第二代手机:
                功能: 打电话，发短信
            第三代手机:
                功能: 打电话升级为视频通话，发短信，玩游戏
        */

        // 创建第一代手机的对象
        FirstGeneration p1 = new FirstGeneration();
        p1.call();

        System.out.println();
        // 创建第二代手机的对象
        SecondGeneration p2 = new SecondGeneration();
        p2.call();
        p2.sendMessage();

        System.out.println();
        // 创建第三代手机的对象
        ThirdGeneration p3 = new ThirdGeneration();
        p3.call();
        p3.sendMessage();
        p3.playGame();
    }
}
