package com.jiaxu.operator;


/**
 * @Author：吴家旭
 * @date：2021/3/9 - 21:00
 */
public class Demo01 {
    public static void main(String[] args) {
        //二元运算符
        //Ctrl + D 复制当前行到下一行
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println("a+b = " + a + b);
        System.out.println("a-b = " +(a - b));
        System.out.println("(a*b) = " + (a * b));
        System.out.println("a/b = " + a / b);  //等于0.5  出来结果为0
        System.out.println("a/b = " + a / (double)b);  //等于0.5  出来结果为0.5

    }

}
