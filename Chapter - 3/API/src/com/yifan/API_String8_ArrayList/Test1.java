package com.yifan.API_String8_ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*
        * 常见方法:
                boolean add(E e)            添加数据到末尾
                void add(int index, E e)    添加数据到指定位置

                E set(int index,E e)        将指定位置的数据修改为新元素
                E get(int index)            获取特定索引的数据
                int size()                  集获取合长度
        * */

        // 创建一个ArrayList集合的对象
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素

        // 细节1: ArrayList 的 add 方法不管添加什么都添加成功，忽略返回值即可
        //      true:添加成功 false:添加失败
        //      此时add方法在任意情况下，都会添加成功，水远不会失败
        //      因为在Java当中，有很多很多的集合 HashSet(元素要唯一)
        //      aaa(true) aaa(false)
        //      设计:跟其他的集合保持统一(面向对象的思想)

//        Boolean res = list.add("bbb");
//        System.out.println(res);
//

        // 细节2: 在集合当中无法直按添加基本数据类型的(byte short int long float double char boolean)
        //      只能添加引用数据类型(对象)
        //      如果在集合里面一定要添加基本数据类型，那么可以转成其对应的包装类
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        // 把qqq添加到 0 索引的位置
        // 细节：
        //      如果集合长度为3，那么下面方法要添加的索引范围只能是 0 ~ 3
        //      0-2 已经存在的索引
        //      3: 把当前元素添加到集合的末尾，等同于一个参数的add方法
        //      如果要添加的索引超出了这个范围。程序就会直接报错
        list.add(0,"qqq");

        System.out.println(list);


    }
}
