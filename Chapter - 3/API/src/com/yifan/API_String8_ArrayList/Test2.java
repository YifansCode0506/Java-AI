package com.yifan.API_String8_ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        /*
        * 常见方法:
            boolean remove(E e)         根据元素删除
            E remove(int index)         根据索引删除
        * */

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(3,"qqq");

        // 细节:
        //      根据元素的内容进行删除的
        //      存在:删除成功true
        //      不存在:删除失败 false
        Boolean res = list.remove("qqq");
        Boolean res2 = list.remove("QQQ");
        System.out.println(res + ", " + res2);
        System.out.println(list);

        // E remove(int index)         根据索引删除
        String res3 = list.remove(0);
        System.out.println(res3);
        System.out.println(list);


    }
}
