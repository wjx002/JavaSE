package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 21:33
 */
public class ForDemo01 {
    public static void main(String[] args) {
        //初始化条件
        int a = 1;
        while (a <= 100) {//循环体
            System.out.println(a);
            a += 2;//迭代
        }
        System.out.println("while循环结束");
        //执行前就已经确认循环次数
        for (int i = 0; i <=100;i++) {
            System.out.println(i);
        }
        System.out.println("for循环结束");
    }
}
