package com.yifan.API_String6_StringBuilder;

public class Test2 {
    public static void main(String[] args) {
        /*
        * StringBuilder的构造方法:
                public StringBuilder() 空参构造
                public StringBuilder(String str) 带参构造

        * StringBuilder的常见成员方法:
                append(任意类型)    添加数据
                reverse()           反转
                int length()        获取长度
                tostring            变回字符串
        * */

        // 1.创建 StringBuilder对象(容器) 无参构造
        StringBuilder sb = new StringBuilder();
        System.out.println("---" + sb + "@@@");
        // int length()
        int len = sb.length();
        System.out.println(len);

        // 2.创建 StringBuilder对象(容器) 带参构造
        StringBuilder sb2 = new StringBuilder("abc");
        // append()
        sb2.append("def");
        System.out.println(sb2);

        // reverse()
        sb2.reverse();
        System.out.println(sb2);
        sb2.reverse();

        //tostring
        String res = sb2.toString();
        System.out.println(res);



    }
}
