package com.yifan.OOP_Interface4_Practice;

public class Test {
    public static void main(String[] args) {

        PingPangPlayer pps =  new PingPangPlayer("樊振东", 29);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();

    }
}
