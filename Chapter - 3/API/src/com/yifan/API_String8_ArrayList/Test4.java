package com.yifan.API_String8_ArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        /*
        * 常见方法:
                E get(int index)            获取元素
                int size()                  集合长度
        * */

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(3,"qqq");

        // E get(int index)            获取元素
        // 获取单个元素
        String res = list.get(0); // aaa
        System.out.println(res);
        System.out.println("--------------------");

        // 遍历
        // 遍历:把容器里面的数据一个一个的拿出来，打印，计算，处理
        for (int i = 0; i < list.size(); i++) {
            // i:依次表示集合中的每个索引
            // list.get(i): 依次获取集合中的每一个元素
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("--------------------");
        // 只能看一看集合当中有什么，无法操作里面的每一个元素的
        System.out.println(list);

    }
}
