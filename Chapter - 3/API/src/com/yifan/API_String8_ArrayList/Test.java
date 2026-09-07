package com.yifan.API_String8_ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*
        *ArrayList集合
            * 空参构造:
                ArrayList()                 创建一个长度为0的集合

            * 常见方法:
                boolean add(E e)            添加数据
                void add(int index, E e)    添加数据
                boolean remove(E e)         删除元素
                E remove(int index)         删除元素
                E set(int index,E e)        修改元素
                E get(int index)            获取元素
                int size()                  集合长度
        * */

        // 创建长度为0的ArrayList集合
        // 如果没有限定，此时集合里面可以存储任意类型的数据
            // ArrayList list = new ArrayList();
            // list.add("abc");
            // list.add("def");
            // list.add(new Student("Jack",18));
            // System.out.println(list);

//        泛型：限定集合当中的数据类型<数据类型>
//        ArrayList list = new ArrayList();
        // 用泛型去限定集合中能存储什么类型的数据
        // ArrrayList<String> list = new ArrayList<String>();
        // list.add("aaa");
        // 重复的内容，泛型可以省略不写，但是括号必须保留.
//        ArrayList<String> list = new ArrayList<>();




    }
}
