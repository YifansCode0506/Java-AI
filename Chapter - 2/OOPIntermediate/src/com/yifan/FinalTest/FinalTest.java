package com.yifan.FinalTest;

import com.yifan.FinalTest.Student;

public class FinalTest {
    public static void main(String[] args) {
        /*
            final修饰变量，此时叫做常量
                特点1:只能被赋值一次，一旦赋值，无法再次修改。
                特点2:常量名大写，多个单词之间用下划线隔开
            细节:
            基本数据类型：
                byte short int long float double char boolean
                变量里记录的是真实的数据
                final int a = 10; 此时变量里面记录的数据无法发生改变
            引用数据类型:
                除了上面四类八种，其他所有的数据类型都是引用类型
                int[] Student Teacher ...
                stu 里边记录对象的内存地址，不可改变的是stu记录的内存地址
                final Student stu = new Student();
            综上所述
                final 修饰哪个变量，这个变量里面记录的内容就无法再改变
        * */
        final int NUMBER = 100;
        // System.out.println(NUMBER + 100);

        // 定义一个引用数据类型的变量
        final Student STU = new Student("张三", 23);
        // STU = new Student();
        STU.setName("李四");
        STU.setAge(23);
        System.out.println(STU.getName());
        System.out.println(STU.getAge());
    }
}
