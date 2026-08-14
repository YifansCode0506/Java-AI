package com.yifan.Extends9;
import org.openjdk.jol.vm.VM;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        //
        System.out.println("对象c在内存真实的地址为： " + Long.toHexString(VM.current().addressOf(c)));

        Scanner sc = new Scanner(System.in);
        sc.next();
    }

}

class Father1 {
    private int a = 0x111;
    int b = 0x222;
    static int staticFather = 0x333;
}

class Child1 {
    private int c = 0x444;
    int d = 0x555;
    static int staticiChild = 0x666;
}