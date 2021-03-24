package com.jiaxu.base;

/**
 * @Author：吴家旭
 * @date：2021/3/9 - 20:48
 */
public class Demo08 {
    //修饰符不存在先后顺序
    final static double PI = 3.14;
    //static final double PI = 3.14;  和上面是相等的

    public static void main(String[] args) {
        System.out.println("PI = " + PI);
    }
}
