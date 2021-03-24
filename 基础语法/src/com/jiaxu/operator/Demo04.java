package com.jiaxu.operator;

/**
 * @Author：吴家旭
 * @date：2021/3/9 - 21:38
 */
public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增  自减
        int a= 3;
        int b =a++;
        System.out.println("a = " + a);

        int c = ++a;
        System.out.println("a = " + a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("c = " + c);
        
        //幂运算2^3
        double pow = Math.pow(2, 3);
        System.out.println("pow = " + pow);
    }
}
