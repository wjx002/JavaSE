package com.jiaxu.method;

/**
 * @Author:吴家旭
 * @date:2021/3/15 - 21:16
 */
public class Demo05 {
    public static void main(String[] args) {
        //数的阶乘
    }
    //5! = 5*f(4)
    //f(4) = 4*f(3)
    //f(3) = 3*f(2)
    //f(2) = 2*f(1)
    //f(1) = 1
    public static int f(int n) {
        if (n == 1) {
            return 1;
        }else {
            return n * f(n - 1);
        }
    }
}
