package com.yifan.API_String4_SubString;

public class Test {
    public static void main(String[] args) {
        /*
        * public String substring(int beginIndex, int endIndex): 截取指定范围
        * public String substring(int beginIndex): 截取到末尾
        *
        * 需求:只保留用户名的第个字符，后面用三个***替代
        * */

        String str = "abcdefghijk"; //012345678910

        //截取
        //一个参数: 截取的开始索引
        //第二个参数: 截取的末尾索引
        //包头不包尾，包左不包右---->包含1素引，但是不包含5索引 1234
        //字符串本身一旦创建之后，是无法发现改变的，截取的时候不会影响调用者的字符申，切记:只有返回值才是截取之后的结果
        String r = str.substring(1, 5);
        System.out.println(r);

        // 参数: 截取的开始索引，默认是截取到字符串的末尾
        String begin = str.substring(1);
        String end = str.substring(5);
        System.out.println(begin); // 删掉第零个
        System.out.println(end); // 删掉前五个

        String username = "Liyuuuuu";

        // charAt(0)
        char firstName1 = username.charAt(0);
        String encryption = firstName1 + "***";
        System.out.println(encryption);

        String firstName2 = username.substring(0, 1);
        String encryption2 = firstName2 + "***";
        System.out.println(encryption2);


    }
}
