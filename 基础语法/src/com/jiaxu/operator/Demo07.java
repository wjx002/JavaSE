package com.jiaxu.operator;

/**
 * @Author：吴家旭
 * @date：2021/3/10 - 21:43
 */
public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b;
        a -= b;
        System.out.println("a = " + a);


        //字符串连接符  + String
        //String 后面的数字是拼接起来的
        System.out.println("" + a + b);//1020
        System.out.println(a + b + "");//30
        System.out.println(a + b + "" + a + b);//301020
        System.out.println("a+b = " + a + b);//a+b =1020
    }
}
