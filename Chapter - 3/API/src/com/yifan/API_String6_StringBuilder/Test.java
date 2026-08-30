package com.yifan.API_String6_StringBuilder;

public class Test {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);

        long time = end - start;
        System.out.println(time);

    }
}
