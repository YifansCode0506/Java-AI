package com.yifan.Extends3;

public class Test1 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Ye {
    String name = "Ye";
}

class Fu extends Ye {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        // 子向上访问最多只能到父类
    }
}
