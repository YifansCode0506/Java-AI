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

    // 行为：遍历技能列表
    public String showSkills(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < skillList.size(); i++) {
            // 添加数据
            sb.append(skillList.get(i));
            // 判断是否是最后一个元素，如果不是则添加逗号和空格
            if(i != skillList.size()-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
