package com.yifan.UI;

import com.yifan.domain.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    // 这个方法表示的就是登录注册的主页面(是以控制台的形式进行展示的)
    public void start() {
        System.out.println("游戏的登录注册页面打开了");

        ArrayList<User> list = new ArrayList<>();

        while(true) {
            System.out.println("==================");
            System.out.println("欢迎来到文字格斗游戏");
            System.out.println("==================");
            System.out.println("请选择操作：1登录 2注册 3退出");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> {
                    System.out.println("用户选择了退出操作");
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    // 注册操作
    public void register(ArrayList<User> list) {
        System.out.println("用户选择了注册操作");
        // 什么叫做注册？
        // 键盘录入用户名，密码，---> User对象 --->集合

        // 1. 创建 User对象 (空参)
        User u = new User();

        // 2. 键盘录入用户名
        //      校验用户名是否符合要求
        //      开发细节：
        //              1. 本地代码校验格式，再通过联网校验内容
        //              2. 先判断异常数据，剩下的就是正确的数据(避免if嵌套)
        //      u.setUsername();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            // 验证：
            //      1.长度必须在3~16位
            //      if(username.length() < 3 || username.length() > 16)
            //      这段代码会反复使用，所以直接定义一个方法在最下边然后调用取反
            if(!checkLen(3,16,username)) {
                System.out.println("用户名长度不符合要求");
                continue;
            }
            //      2.只能由字母、数字组成，不能是纯数字
            if(!checkUsername(username)) {
                System.out.println("用户名内容不符合要求");
                continue;
            }
            //      3.用户名唯一
            //          username 到list当中判断是否包含
            //          包含:重复
            //          不包含:唯一
            if(contains(list,username)) {
                System.out.println("用户名已存在，请重新输入");
                continue;
            }

            // 当代码执行到这里，表示用户名username长度，内容都符合要求，且唯一
            u.setUsername(username);
            break;

        }

        // 3.键盘录入密码
        while(true) {
            //      校验密码是否符合要求
            //      u.setPassword();
            System.out.println("请输入密码");
            String password1 = sc.next();


            // 长度3~8位
            if(!checkLen(3,8,password1)){
                System.out.println("密码长度不符合要求，必须是 3 ~ 8 位之间");
                continue;
            }
            // 只能是字母加数字的组合，不能有其他字母
            if(!checkPassword(password1)){
                System.out.println("密码不符合要求");
                continue;
            }

            System.out.println("请再次输入密码");
            String password2 = sc.next();

            // 校验两次密码是否输入一致
            if(!password1.equals(password2)) {
                System.out.println("两次密码输入不一致");
                continue;
            }

            // 把密码设置到对象当中
            u.setPassword(password1);
            break;
        }

        // 4.把User对象添加到集合当中
        list.add(u);
        // 5.提示成功
        System.out.println("用户" + u.getUsername() + "注册成功");
    }

    // 登录操作
    public void login(ArrayList<User> list) {
        System.out.println("用户选择了登录操作");
    }

    // 公用方法
    // 统计字符串中，字母，数字，其他字符分别有多少个
    public int[] getCount(String userInfo){
        int charCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for(int i = 0; i < userInfo.length(); i++) {
            char ch = userInfo.charAt(i);
            if(Character.isLetter(ch)) { // ch >= 'a' && c <='z' c>= 'A' && c <= 'Z"
                charCount++;
            }else if(Character.isDigit(ch)) { // ch >= '0' && c <='9'
                numCount++;
            }else {
                otherCount++;
            }
        }
        return new int[]{charCount,numCount,otherCount};

    }


    // ==========================================================================
    // 判断用户名
    // 判断字符串长度是否在指定范围
    // 字符串，指定范围(最小值，最大值)
    public boolean checkLen(int minLen, int maxLen, String str) {
        /*
        if(str.length() >= minLen && str.length() <= maxLen) {
            return true;
        }else  {
            return false;
        }
        * */
        return str.length() >= minLen && str.length() <= maxLen;
    }
    // 判断字用户名是否符合要求
    // 不能纯数字

    public boolean checkUsername(String username) {
        int[] arr = getCount(username);
        // 0: 字母的个数
        // 1：数字的个数
        // 2：其他字符的个数

        // 字母至少有一个, 数字可有可无, 其他字符一定不能有
        return arr[0] > 0 && arr[1] > 0 && arr[2] == 0;
    }

    // 判断用户名在集合当中是否包含
    public boolean contains(ArrayList<User> list, String username) {
        for(int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }


    // ==========================================================================
    // 判断密码
    public boolean checkPassword(String password) {
        // 0: 字母的个数
        // 1：数字的个数
        // 2：其他字符的个数

        // 字母至少有一个, 数字至少有一个, 其他字符一定不能有
        int[] arr = getCount(password);
        return arr[0] > 0 && arr[1] > 0 && arr[2] == 0;
    }
}
