package com.yifan.UI;

import com.yifan.domain.HeroCharacter;

import java.util.Scanner;

public class FightingGame {
    public void gameStart(String username) {
        System.out.println("==================");
        System.out.println("欢迎" + username + "来到文字格斗游戏");
        System.out.println("==================");

        // 2. 创建玩家角色(名字 + 属性分配)
        HeroCharacter player = createPlayerCharacter(username);

        // 3. 显示创建角色的信息和技能列表
        System.out.println("角色创建成功！");
        System.out.println("初始属性为：" + player.show());
        System.out.println("拥有的技能：" + player.showSkills());

    }
    // 作用：用来创建一个玩家的角色
    // 参数：用户名
    // 返回值（方法的结果）
    public HeroCharacter createPlayerCharacter(String username) {
        // 结果就是创建好的玩家角色
        // 调用处：要调用
        System.out.println("创建您的角色：");
        System.out.println("您的角色名为：" + username);

        // 属性分配
        int points = 20;

        // 提示：
        System.out.println("请分配属性点（共20点）：");
        System.out.println("1. 生命值（每点 + 10HP）");
        System.out.println("2. 攻击力（每点 + 2ATK）");
        System.out.println("3. 防御力（每点 + 1DEF）");
        Scanner sc = new Scanner(System.in);

        // 定义数组要把要提示的语句存起来
        String[] attributes = {"生命值", "攻击力", "防御力"};
        // 定义数组记录三个属性分配的属性点
        int[] values = new int[3];
        
        // 利用一个循环分配属性点
        for (int i = 0; i < attributes.length; i++) {
            System.out.println("分配点数到" + attributes[i] + "(剩余点数：" + points + "点)");
            // input 表示当前用户键盘录入的数据(要分配的属性点)
            int input = sc.nextInt();

            // 如果要分配的属性点为负数
            if(input < 0){
                System.out.println("无效输入！默认分配0点");
                input = 0;
            }

            if(input > points){
                System.out.println("属性点不足！剩余属性点全部分配到:" + attributes[i]);
                input = points;
            }

            // 剩余：20
            // 录入 10
            // 计算一下剩余还有多少属性点
            points -= input;

            // 记录分配的属性点
            values[i] = input;
        }

        // 我已经知道了用户要分配的属性点 ---> values[i]

        // 创建玩家角色的对象
        HeroCharacter player = new HeroCharacter(
                username,
                100 + values[0]*10,
                10 + values[1]*2,
                0 + values[2]*1
        );

        // 添加玩家的技能
        player.skillList.add("普通攻击");
        player.skillList.add("强力一击");
        player.skillList.add("生命汲取");

        return  player;

        /*
            Scanner sc = new Scanner(System.in);
            int hpPoint =  sc.nextInt();
            if (hpPoint < 0) {
                System.out.println("无效输入！默认分配0点");
                hpPoint = 0;
            }

            if (hpPoint > points) {
                System.out.println("属性点不足！剩余属性点全部分配到生命值");
                hpPoint = points;
            }

            // 分配属性点
            points = points - hpPoint;
        * */



    }
}
