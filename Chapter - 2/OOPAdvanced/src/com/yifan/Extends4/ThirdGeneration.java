package com.yifan.Extends4;

public class ThirdGeneration extends SecondGeneration {
    // @Override 是注解/注释: 对代码的解释说明
    // 给虚拟机看的，让虚拟机知道下边是重写的
    @Override
    public void call() {
        System.out.println("开启视频");
        System.out.println("用手机打电话");
    }

    public void playGame() {
        System.out.println("打游戏");
    }
}
