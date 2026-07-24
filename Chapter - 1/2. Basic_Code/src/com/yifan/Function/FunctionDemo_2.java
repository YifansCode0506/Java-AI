package com.yifan.Function;

import java.util.Random;

public class FunctionDemo_2 {
    public static void main(String[] args) {
        // 1. 创建数组
        int[] arr = new int[10];

        // 2. 生成 10 个不重复的随机数
        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = random.nextInt(100) + 1;

            // 如果当前随机数在已填入的数据中不存在，才存入数组
            boolean flag = contains(num, arr, i);
            if (!flag) {
                arr[i] = num;
                i++;
            }
        }

        // 3. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean contains(int num, int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
