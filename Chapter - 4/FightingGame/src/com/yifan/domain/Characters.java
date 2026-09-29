package com.yifan.domain;

public class Characters {
    public String name; // 名字
    public int HP; // 当前生命
    public int maxHP; // 最大生命
    public int attack; // 攻击力
    public int defense; // 防御力

    public Characters() {

    }

    // 刚创建时人物的血量是满的
    public Characters(String name, int HP, int attack, int defense){
        this.name = name;
        this.HP = HP;
        this.maxHP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    // 行为：
    // 1. 判断当前角色是否存活
    public boolean isAlive(){
        return HP > 0;
    }

    // 2.恢复血量
    // 作用:恢复血量
    // 形参:具体回多少血
    public void heal(int amount) {
        HP += amount;
        if (HP > maxHP) {
            HP = maxHP;
        }
    }

    // 3. 受到伤害
    // 作用:受到了N点伤害之后，还有多少点血
    // 形参:具体受到了多少点伤害
    public void takeDamage(int damage) {
        HP -= damage;
        if (HP < 0) {
            HP = 0;
        }
    }

    // 4. 展示人物属性
    public String show(){
        return name + "[当前生命：" + HP + "，攻击：" + attack + "，防御：" + defense + "]";
    }
}


