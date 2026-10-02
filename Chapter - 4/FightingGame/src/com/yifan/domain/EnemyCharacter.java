package com.yifan.domain;

public class EnemyCharacter extends Characters{
    public String skill; // 技能只有一个
    // defending 状态：
    // false 没有状态
    // true 拥有状态
    public boolean defending;

    public EnemyCharacter() {
        super();
    }

    public EnemyCharacter(String name, int HP, int attack, int defense, String skill) {
        super(name, HP, attack, defense);
        this.skill = skill;
    }

    @Override
    public void takeDamage(int damage) {
        // 如果处于防御状态，受到的伤害减半
        if(defending){
            damage = damage / 2 > 1 ? damage / 2 : 1;
            // 防御的状态只能持续一个回合
            defending = false;
        }

        // 调用父类的方法，扣除血量
        super.takeDamage(damage);
    }
}
