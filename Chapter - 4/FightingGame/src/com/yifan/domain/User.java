package com.yifan.domain;

import java.util.Random;

public class User {
    // id，用户名，密码，状态
    private String id;
    private String username;
    private String password;
    private boolean status;

    public User(){
        // 调用 createID 方法
        id = createID();
        // 修改status数值
        status = true;
    }
    public User(String username, String password) {
        id = createID();
        this.username = username;
        this.password = password;
        status = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // 用户无法设置，是自动生成的，格式为:Fight+5位数字的随机数
    public String createID(){
        StringBuilder b = new StringBuilder("Fight");

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(10);
            b.append(num);
        }
        return b.toString();
    }
}
