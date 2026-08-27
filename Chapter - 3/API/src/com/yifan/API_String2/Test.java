package com.yifan.API_String2;

public class Test {
    public static void main(String[] args) {
        /*
            第一种:直接赋值
            第二种:new关键字
            publif String()                空白字符串，不含任何内容
            public String(String original) 根据传入的字符串，创建新的字符串对象
            public String(char[] chs)      根据字符数组，创建字符串对象
            public String(byte[] chs)      根据字节数组，创建字符串对象
        *
        * */

        // 1.直接赋值
        // 最简单 最常用
        String s = "abc";
        System.out.println(s);

        // 2. new + 构造方法的方式创建字符串对象
        // new + 空参构造
        String s1 = new String();
        System.out.println("--" + s1 +"@@");

        // 3. new + 含参构造
        // 根据传入字符串的内容，创建一个新的字符串对象
        String s2 = new String(s);
        System.out.println(s2);

        // 4. new + 含参构造(字符串组)
        char[] chs = {'a','b','c','d','e'};
        String s3 = new String(chs);
        System.out.println(s3);

        // 5. new + 含参构造(字节数组)
        // ASCII码表
        // 97 --- 'a'
        byte[] bytes = {97,98,99,100,101};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
