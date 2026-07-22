package com.yifan.Conditionals;
import java.util.Scanner;

public class ConDemo_1 {
    public static void main(String[] args){
        // 需求，健盘录入星期数，显示今天的减肥活动。
        // 周一: 跑步
        // 周二: 游泳
        // 周三: 慢走     
        // 周四: 动感单车
        // 周五: 拳击
        // 周六: 爬山
        // 周日: 好好吃一顿

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
//switch的注意点:
//    1. 表达式: 结果(字符/整数byte short int/枚举/字符串) ---跳转表，索引不支持小数，也不支持大的整数long
//    2. case: 被匹配的值，只能是真实的数据
//    long number = 10;
//    int a = 1;
//    int b = 2;
//    switch (number){
//        case a:
//            System.out.println("跑步");
//            break;
//        case 2:
//            System.out.println("游泳");
//            break;

//    3. case: 值不允许重复
//        case 3:
//            System.out.println("慢走");
//            break;
//        case 3:
//            System.out.println("动感单车");
//            break;

//    4. break: 表示中断，结束的意思，结束switch语句
//        case 4:
//            System.out.println("拳击");
//    }

//    5. default: 所有情况都不匹配，执行该处的内容