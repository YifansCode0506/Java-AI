package com.yifan.UI;

import com.yifan.domain.EnemyCharacter;
import com.yifan.domain.HeroCharacter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FightingGame {

    // 启动游戏

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

        // 4.创建多个敌人列表
        ArrayList<EnemyCharacter> enemyList = new ArrayList<>();
        enemyList.add(new EnemyCharacter("初级战士", 80, 15, 10, "致死打击"));
        enemyList.add(new EnemyCharacter("敏捷刺客", 60, 20, 5, "背刺"));
        enemyList.add(new EnemyCharacter("重装坦克", 120, 10, 20, "神圣之锤"));
        enemyList.add(new EnemyCharacter("神秘法师", 70, 25, 8, "寒冰箭"));

        // 5.准备战斗(依次跟多个敌人战斗)
        int count = 1; // 记录当前我是跟第几个敌人战斗
        int wins = 0; // 记录胜利了几场

        // 游戏中，依次和敌人进行战斗，直到我方生命值为0
        while(player.isAlive()){
            // 进入循环，开始准备战斗

            // 5.1 重置敌人的属性，敌人属性每场HP+10，ATK+3, DEF+2(敌人:越来越打)(第二场的时候开始增加)
            // 第二场：意味着第一场胜利了
            if(wins != 0){
                // 获取每个敌人的信息，进行属性增加
                for (int i = 0; i < enemyList.size(); i++) {
                    EnemyCharacter c = enemyList.get(i);
                    // 每场 maxHP + 10
                    c.maxHP = c.maxHP + 10; // +=
                    c.HP = c.maxHP;
                    // ATK + 3
                    c.attack = c.attack + 3;
                    // DEF + 2
                    c.defense = c.defense + 2;
                    // 每场战斗前，如果有减伤的buff，需要清空
                    c.defending = false;
                }
            }
            // 5.2 随机选择敌人(Random)
            Random r = new Random();
            int index = r.nextInt(enemyList.size());
            EnemyCharacter enemy = enemyList.get(index);
            System.out.println(enemy.show());


            // 5.3开始跟抽取到敌人进行战斗
            // 回合制(你打我一下，我打你一下)
            // 内循环:跟单个敌人进行多轮战斗，直到有一方的血量为0才会结束
            System.out.println("==================================");
            System.out.println("\uFE0F 第"+ count +"场战斗开始！对手：" + enemy.name);

            // 跟当前的敌人是第几回合
            int round = 1;
            while(player.isAlive()){
                // 显示双方的状态(生命值)
                System.out.println("----------------------------------");
                System.out.println("\uFE0F 第"+ count +"回合开始");

                // 打印敌我双方的血条
                System.out.println(getHealthBar(player.name, player.HP, player.maxHP));
                System.out.println(getHealthBar(enemy.name, enemy.HP, player.maxHP));


                // 5.4 玩家回合:选择行动(1 普通攻击/2 强力一击/3 生命汲取)
                playerTurn(player, enemy);

                // 5.5 判断敌方是否被击败
                if(!enemy.isAlive()){
                    System.out.println("你击败了" + enemy.name + "!");
                    wins++;
                    break;
                }

                // 5.6 敌人回合:选择行动(50%的几率普通攻击/50%的几率技能攻击/不同的敌人采取不同的技能进行攻击)
                enemyTurn(enemy, player);

                // 5.7 判断玩家是否被击败
                if(!player.isAlive()){
                    System.out.println("你被" + enemy.name + "击败了!");
                    break; // 战斗停止
                }
                round++;
            }

            // 5.8 跟一个敌人的战斗结束之后，玩家胜利(继续战斗) 玩家失败(游戏停止)
            if(player.isAlive()){
                // 计算恢复量
                int healHP = r.nextInt(21) + 30;
                //恢复玩家的血量
                player.heal(healHP);
                // 提示
                System.out.println("当前战斗结束！恢复了" + healHP + "点HP");
                System.out.println("当前胜利" + wins + "场");
                System.out.println("==================================");
            }

            // 5.9 每胜利三场，人物的属性就需要增加
            if(player.isAlive() && wins > 0 && wins % 3 ==0){
                System.out.println("恭喜！你获得了属性提升");
                // 提升最大生命值
                player.maxHP = player.maxHP + 30;
                // 提升攻击力
                player.attack = player.attack + 5;
                // 提升防御力
                player.defense = player.defense + 3;
                System.out.println("最大生命值 + 30，攻击力 + 5，防御力 + 3");
                System.out.println("当前属性：" + player.show());
            }

            if(player.isAlive()){
                System.out.println("是否继续下一场战斗？(y/n)");
                Scanner sc = new Scanner(System.in);
                String choose = sc.next();
                if(choose.equalsIgnoreCase("y")){ // 或者写"y".equalsIgnoreCase(choose)
                    // 战斗继续
                    count++;
                    // 循环继续进行，执行下一场战斗
                    continue;
                }else if(choose.equalsIgnoreCase("n")){
                    // 玩家主动结束游戏
                    break;
                }else{
                    System.out.println("没有这个选项，默认游戏继续");
                    count++;
                    continue;
                }
            }
        }

        // 6. 最终结算
        System.out.println("==================================");
        System.out.println("游戏结束");
        System.out.println("总胜场：" + wins);
        System.out.println("感谢游玩文字格斗游戏");
        System.exit(0);
    }

    // 作用：用来创建血条
    public String getHealthBar(String name, int HP, int maxHP){
        // 满血状态下，打印20个方块
        int barLength = 20;

        // 计算在不同的血量当中，一共打印多少个方块
        // 最大血量: 200
        // 当前血量: 100
        int filled = (int)((HP * 1.0 / maxHP) * barLength);
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");
        for (int i = 0; i < barLength; i++) {
            if(i < filled){
                sb.append("■");
            }else {
                sb.append(" ");
            }
        }
        // ] 100/100 HP
        sb.append("]").append(HP).append('/').append(maxHP).append(" HP");

        return sb.toString();
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

    // 玩家回合:选择行动(1 普通攻击/2 强力一击/3 生命汲取)
    public void playerTurn(HeroCharacter player, EnemyCharacter enemy){
        System.out.println("你的回合");
        System.out.println("1.普通攻击");
        System.out.println("2.强力一击");
        System.out.println("3.生命汲取");
        System.out.println("选择行动(1-3): ");
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        switch (choose) {
            default:
                System.out.println("没有这个操作，默认使用普通攻击");
            case "1":
                // 我方的攻击力 - 对方的防御力
                int damage1 = calculateDamage(player.attack, enemy.defense);
                System.out.println("你对" + enemy.name + "使用了普通攻击，造成了" + damage1 + "点伤害！");
                // 血量扣除
                enemy.takeDamage(damage1);
                break;
            case "2":
                if(player.HP > 10) {
                    // 消耗我方10HP
                    player.takeDamage(10);
                    // 计算我方技能对对方造成多少伤害
                    int damage2 = calculateDamage((int)(player.attack * 1.8), enemy.defense);
                    // 提示对对方造成多少伤害
                    System.out.println("消耗10HP，你对" + enemy.name + "使用了强力一击，造成了" + damage2 + "点伤害！");
                    // 给敌人进行扣血
                    enemy.takeDamage(damage2);
                }else {
                    System.out.println("体力不足，无法释放");
                }
                break;
            case "3":
                if(player.HP > 5) {
                    // 消耗我方5HP
                    player.takeDamage(5);
                    // 计算恢复了多少HP
                    Random r = new Random();
                    int healHP = r.nextInt(21);
                    // 真正恢复的血量
                    player.heal(healHP);
                    // 提示：
                    System.out.println("消耗5HP，你对" + enemy.name + "使用了生命汲取，恢复了" + healHP + "点HP！");
                }else {
                    System.out.println("体力不足，无法释放");
                }
                break;
        }
    }

    // 作用：敌人的回合
    private void enemyTurn(EnemyCharacter enemy, HeroCharacter player) {
        System.out.println("=====" + enemy.name + "的回合 =====");

        // 计算是普通攻击还是技能攻击（50%）
        String action = "普通攻击";
        Random r = new Random();
        int num = r.nextInt(10); // 0-9之间获取，0-4是普通攻击，5-9是技能攻击
        if(num >= 5){
            action = enemy.skill;
        }

        // 根据不同的情况，采取不同的攻击手段
        switch (action) {
            case "普通攻击":
                System.out.println("敌人采取了普通攻击");
                // 计算伤害
                int damage1 = calculateDamage(enemy.attack,  player.defense);
                // 提示
                System.out.println(enemy.name + "对你使用了普通攻击，造成了" + damage1 + "点伤害！");
                // 我方扣血
                player.takeDamage(damage1);
                break;
            case "猛击":
                System.out.println("当前的战士采取了猛击");
                // 计算伤害
                int damage2 = calculateDamage((int)(enemy.attack * 1.5),  player.defense);
                // 提示
                System.out.println(enemy.name + "对你使用了猛击，造成了" + damage2 + "点伤害！");
                // 我方扣血
                player.takeDamage(damage2);
                break;
            case "背刺":
                System.out.println("当前的刺客采取了背刺");
                // 计算伤害
                int damage3 = 0;
                for (int i = 0; i < 2; i++) {
                    int temp = calculateDamage((enemy.attack / 2),  player.defense);
                    damage3 += temp;
                }
                // 提示
                System.out.println(enemy.name + "对你使用了背刺，造成了" + damage3 + "点伤害！");
                // 我方扣血
                player.takeDamage(damage3);
                break;
            case "神圣之锤":
                System.out.println("当前的重装坦克采取了神圣之锤");
                enemy.defending = true;
                System.out.println(enemy.name + "对使用了神圣之锤，活动防御姿态！");
                break;
            case "寒冰箭":
                System.out.println("当前的法师采取了寒冰箭");
                int damage4 = calculateDamage((int)(enemy.attack * 1.8),  player.defense);
                System.out.println(enemy.name + "对你使用了寒冰箭，造成了" + damage4 + "点伤害！");
                player.takeDamage(damage4);
                break;
        }
    }

    // 作用:用来计算双方战斗的时候，造成的伤害
    // 普通攻击的调用方式:calculateDamage(我方攻击力，对方的防御力);
    // 技能攻击的调用方式:calculateDamage(我方攻击力*百分比，对方的防御力);
    public int calculateDamage(int attack, int defense){
        int damage = attack -  defense;
        if(damage < 1){
            damage = 1;
        }
        return damage;
    }
}
