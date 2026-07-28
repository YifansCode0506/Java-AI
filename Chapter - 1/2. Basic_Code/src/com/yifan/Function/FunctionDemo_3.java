package com.yifan.Function;

public class FunctionDemo_3 {
    // 求两个整数的和
    public static int sumTwo(int a, int b) {
        return a + b;
    }
    // 求三个整数的和
    public static int sumThree(int a, int b, int c) {
        return a + b + c;
    }
    // 求四个整数的和
    public static int sumFour(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    /*
    方法重载
        同一个类中，定义了多个同名的方法，这些方法具有类似的功能
        每个方法具有不同的参数类型和参数个数，这些同名的方法，就构成了重载关系
        简单理解:同一个类，方法名相同，参数不同的方法，无需看返回值。
        个数不同  方法一: int / 方法二:int int
        类型不同  方法一: int / 方法二: double
        顺序不同  方法一: int double / 方法二: double int
    * */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(getSum(a, b));
    }

    // 求两个整数的和
    public static int getSum(int a, int b) {
        return a + b;
    }

//    public static int getSum(int a, double b) {
//        return a + b; 会报错，因为类型不匹配
//    }
//      ·当调用getSum(a,b)时，Java会寻找最匹配的方法
//      ·由于没有完全匹配的getSum(int,int)方法，Java无法确定应该调用哪个重载方法
//      ·int到double的转换虽然可以自动进行，但两个参数都需要转换时，编译器无法确定最优选择

    // 求三个整数的和
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    // 求四个整数的和
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
