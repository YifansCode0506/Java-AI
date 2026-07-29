package com.yifan.Test;

public class Test {

    /*
        给你一个数组 nums 和一个值 val, 你需要删除所有数值等于 val 的元素
        举例1:
        输入: nums = [3, 2, 2, 3] val = 3
        输出: nums = [2, 2] 剩余 2 个元素
        举例:
        输入: nums = [0, 1, 2, 2, 3, 0, 4, 2] val = 2
        输出: nums = [0, 1, 4, 0, 3] 剩余 5 个元素
    * */
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int slow = 0;
        int fast = 0;

        while (fast < arr.length) {
            if (arr[fast] != val) {
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
