package com.yifan.OOP_Interface4_Practice;

public class PingPangPlayer extends Player implements InterEnglish {

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("PingPang players are speaking English");
    }

    @Override
    public void study() {
        System.out.println("PingPang players are studying PingPang game");
    }
}
