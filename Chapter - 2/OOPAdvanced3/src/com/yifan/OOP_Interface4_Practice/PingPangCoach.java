package com.yifan.OOP_Interface4_Practice;

public class PingPangCoach extends Coach implements InterEnglish{

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("PingPang coach is teaching PingPang players");
    }

    @Override
    public void speakEnglish() {
        System.out.println("PingPang coach is learning English");
    }
}
