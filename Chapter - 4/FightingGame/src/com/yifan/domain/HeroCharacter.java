package com.yifan.domain;

import java.util.ArrayList;

// 我方游戏角色
public class HeroCharacter extends Characters{
    public ArrayList<String> skillList;

    // 外界我要给我方角色添加技能的时候，无需考虑集合，直接add就行
    public HeroCharacter(){
        super();
        skillList = new ArrayList<>();
    }

    public HeroCharacter(String name, int HP, int attack, int defense){
        super(name, HP, attack, defense);
        skillList = new ArrayList<>();
    }
}
