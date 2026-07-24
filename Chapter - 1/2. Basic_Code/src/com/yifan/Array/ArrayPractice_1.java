package com.yifan.Array;

import java.util.Random;

public class ArrayPractice_1 {
    public static void main(String[] args) {
        // 1. 创建数组
        int[] arr = new int[10];

        // 2. 生成随机数
        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = random.nextInt(100) + 1;
            // 对 num 进行判断，存在 则 不存，不存在 则 存入
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                    // 跳出循环
                    break;
                }
            }
            // 对 count 进行判断
            if (count == 0) {
                arr[i] = num;
                // 只有生成一个满足要求的随机数时，索引才会自增
                i++;
            }
        }
        // 3.遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
