package com.yifan.API_String_Methods;

public class Test {
    public static void main(String[] args) {
        /*
        * String 类当中常见的方法:
            比较              equals equalsIgnorecase
            长度              length
            获取单个字符       charAt
            截取              substring
            替换              replace
            *
            是否包含           contains
            判断开头、结尾     startsWith/endsWith
            查找              indexof(int ch), lastIndexof(int ch)
            判断是否为空       isEmpty()
            转字符数组         tocharArray()
            大小写转换         toUpperCase(), toLowerCase()
            去除头尾空格       trim()

        *
        * */
        // contains 需要是连续的
        String str = "abcdefg";
        boolean a1 = str.contains("abc");
        boolean a2 = str.contains("abd");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("**************************************");

        // startsWith/endsWith
        boolean b1 = str.startsWith("a"); // 是否以a开头
        System.out.println(b1);
        boolean b2 = str.startsWith("abc",1); // 从1开始是否以abc开头
        System.out.println(b2);
        boolean b3 = str.endsWith("abc");
        System.out.println(b3);
        boolean b4 = str.endsWith("fg"); // 可以用来判断是否是 .txt 文件
        System.out.println(b4);
        System.out.println("**************************************");

        // indexof(int ch), lastIndexof(int ch)
        int i1 = str.indexOf(97); // 查找a第一次出现索引
        System.out.println(i1);
        int i2 = str.lastIndexOf("e");
        System.out.println(i2);
        int i3 = str.lastIndexOf(97,1);
        System.out.println(i3);
        System.out.println("**************************************");

        // isEmpty()
        boolean c1 = str.isEmpty();
        System.out.println(c1);
        String str2 = "";
        boolean c2 = str2.isEmpty();
        System.out.println(c2);
        System.out.println("**************************************");

        // tocharArray()
        char[] array = str.toCharArray(); // "abcdefg" --> ['a', 'b', 'c'...]
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("**************************************");

        // toUpperCase(), toLowerCase()
        String d = str.toUpperCase();
        System.out.println(d);
        System.out.println("**************************************");

        // trim()
        String str3 = " a b c "; // 去除头尾空格
        String f = str3.trim();
        System.out.println(f);

    }
}
