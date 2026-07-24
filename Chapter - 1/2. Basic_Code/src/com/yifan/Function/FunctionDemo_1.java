package com.yifan.Function;

public class FunctionDemo_1 {
    public static void main(String[] args) {
        /*
            练习:定义一个方法，求两个数的和
            格式:
            public static 返回值类型方法名(参数1，参数2...){
                方法体;
                return 返回值;
            }
            调用格式：
                方法名(参数1, 参数2);
            注意点：
                1. 方法跟方法之间是平级关系，不能互相嵌套
                2. 方法不会主动运行，需要被调用才可以
                3. 小括号中的参数要一一对应(个数，类型)
        */
        int add = getSum(10,20); //实参
        System.out.println(add);
        System.out.println(getSum(10,20));
    }
    public static int getSum(int a, int b) { // 形参
        int sum = a + b;
        return sum; // return的两个作用: 1. 结束方法的运行; 2. 把结果返回给方法的调用处
    }
}
