package com.yifan.API_String8_ArrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        /*
        * 常见方法:
                E set(int index,E e)        修改元素
        * */

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(3,"qqq");

//        Boolean res = list.remove("qqq");
//        Boolean res2 = list.remove("QQQ");
//        System.out.println(res + ", " + res2);
        System.out.println(list);
        System.out.println("-------------------------------");

//        String res3 = list.remove(0);
//        System.out.println(res3);
//        System.out.println(list);
        System.out.println("-------------------------------");

        // E set(int index,E e)        修改元素
        // 细节：
        //      把指定索引上的数据修改为新的数据，把被替换的元素进行返回
        // 注意:
        //      如果当前的索引不存在，代码会报错
        String res = list.set(0, "ZZZ");
        System.out.println(res); // aaa
        System.out.println(list); // [ZZZ, bbb, ccc, qqq]

    }
}
