package com.yifan.ToolClassTest;

public class ArrayUtil {
    // 私有化构造方法，目的:不让外界创建对象
    private ArrayUtil() {}
        // 定义方法(静态)
        /* 提供一个方法printArr，用于遍历数组。
        格式如下:[10, 20, 50, 34, 100](只考虑整数数组)*/
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }

    public static double getAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum * 1.0 /arr.length;
    }
}
