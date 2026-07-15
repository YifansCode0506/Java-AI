package com.yifan.variable;

public class Scanner {
    public static void main(String[] args) {
        // Keyboard input
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Read an integer
        int num = sc.nextInt();
        System.out.println(num);

        // Read a decimal number
        double num2 = sc.nextDouble();
        System.out.println(num2);

        // Read text
        String context = sc.next();
        System.out.println(context);

        sc.close();
    }
}
