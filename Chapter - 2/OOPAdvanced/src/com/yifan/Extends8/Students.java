package com.yifan.Extends8;

public class Students extends Person{
    private String grade;

    // 空参构造
    public Students() {
    }

    // 带全部参数的构造方法(父 + 子)
    public Students(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // get / set

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // 行为
    public void study(){
        System.out.println("studying");
    }
}
