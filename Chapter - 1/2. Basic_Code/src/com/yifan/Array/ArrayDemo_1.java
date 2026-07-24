package com.yifan.Array;

public class ArrayDemo_1 {
    public static void main(String[] args) {
        /*
            数组中元素的访问
                1. 获取元素
                2. 修改数据
        */

        // 1. 利用静态初始化创建数组
        int[] arr = {10, 20, 30, 40, 50};
        // 2.获取数组中的元素
        // 索引:从e开始，连续+1,中间不间断
        // 0 1 2 3 4
        int num = arr[0];
        System.out.println(num);
        System.out.println(arr[0]);

        // 获取1索引的数据
        System.out.println(arr[1]);
        // 修改数据
        //arr[索引] = 新数据;
        //注意:一旦修改完毕，原来的数据就被覆盖了
        arr[0] = 100;
        System.out.println(arr[0]); // 100 20 30 40 50
    }
}
