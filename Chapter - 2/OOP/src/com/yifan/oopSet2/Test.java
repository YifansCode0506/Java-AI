package com.yifan.oopSet2;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();
        // 赋值
        s.setName("T");
        s.setAge(18);
        s.setHeight(165);
        s.setWeight(100);

        //大一新生, T, 18岁, 165cm, 50kg, 刚进大学努力学习。
        System.out.println(s.getName() + "," +  s.getAge() + "," + s.getHeight() + "," + s.getWeight());
        s.study();

        //大二期间张三体重增加了10kg
        s.setAge(s.getAge() + 1);
        int newWeight = s.getWeight() + 10;
        s.setWeight(newWeight);
        System.out.println(s.getName() + "," +  s.getAge() + "," + s.getHeight() + "," + s.getWeight());

        //大三期间张三减肥成功，身高增加2cm，体重减少10kg
        s.setAge(s.getAge() + 1);
        s.setHeight(s.getHeight() + 2);
        s.setWeight(s.getWeight() - 10);
        System.out.println(s.getName() + "," +  s.getAge() + "," + s.getHeight() + "," + s.getWeight());

        // 毕业时
        s.setAge(s.getAge() + 1);
        System.out.println(s.getName() + "," +  s.getAge() + "," + s.getHeight() + "," + s.getWeight());
    }
}
