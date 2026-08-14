package com.yifan.OOP_Polymorphic2;

public class Test {
    public static void main(String[] args) {

        //利用多态的方式创建对象
        Father f = new Child();
        // 调用成员变量：编译看左边，运行也看左边
            // 编译看左边：在把java文件编译成class文件的时候
                // 看父类中有没有这个变量，如果有则编译成功
        // 运行也看左边，在代码真正运行的时候，使用父类中的变量

        System.out.println(f.name);
        // System.out.println(f.age);

        // 调用成员方法: 编译看左边，运行看右边
        // 看父类当中有没有这个方法，如果没有代码报错
        // 编译看左边: 在代码真正运行的时候，运行的时子类里面的方法
        // 运行看右边: 如果子类没有重写父类里面的方法，使用的还是父类
        f.show();

        // 问题一:为什么调用fatherShow方法程序没有报错？
        // 问题二:程序运行的结果是什么？
        f.fatherShow();

        // 问题：为什么调用childShow方法程序报错了？
        // 弊端：不能调用子类的特有方法
        // f.childShow();

        // 解决多态弊端
            // 把对象转回子类类型就可以了
        Child c = (Child)f;
        c.childShow();

        // 注意点：
        // 如果有三个 爷爷 爸爸 儿子
        // 创建了爸爸的对象，赋值给了爷爷类型
        // 在进行强制类型转换的时候，只能转到爸爸类型，不能转成儿子类型

        Grand g = new Father();
        if(g instanceof Father){
            Father f1 = (Father)g;
            f1.fatherShow();
            f1.show();
        }else{
            System.out.println("请确定好类型再转换");
        }

    }
}
