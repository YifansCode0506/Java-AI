package com.yifan.variable;

public class VariableDemo {
    public static void main(String[] args) {
        // 微信余额:0元
        // 支付宝余额:10元
        // 银行卡余额:20元
        // 问题一:请问现在一共有多少钱?
        // 问题二:微信收了10元红包，又发了2元红包，余额多少?

        // 1. 定义一个变量记录微信的余额
        double a = 0;

        // 2. 定义一个变量记录支付宝的余额
        double b = 10;

        // 3. 定义一个变量记录银行卡的余额
        double c = 20;

        // 4. 输出现在总共有多少
        System.out.println(a+b+c);

        // 5. 微信收了10
        // 用原来的余额 + 10 = 新的余额
        a = a + 10;
        // 执行过程：
        // 1. 计算 a + 10，此时变量 a 里记录的是100，100 + 10，得到结果110；
        // 2. 再把 110 赋值给变量 a，此时变量 a 原本的值被覆盖

        a = a - 2;
        System.out.println(a);
    }
}
