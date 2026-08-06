package com.yifan.ToolClassTest;

public class Test {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr = {10, 20, 30, 40, 50};
        // 遍历
        ArrayUtil.printArr(arr);
        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 7};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
