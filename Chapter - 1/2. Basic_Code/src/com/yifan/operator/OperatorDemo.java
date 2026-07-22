package com.yifan.Operator;

public class OperatorDemo {
    public static void main(String[] args) {
        // 实现字母的大小写转换，将大写字母转化为小写字母
        // A ---> a

        // 1. 定义变量记录大写的字符
        char a = 'A';

        // 2. 转成小写
        // 65 + 32 = 97 ASC II
        char cc = (char)(a + 32);
        System.out.println(a);
        System.out.println(cc);
    }
}
