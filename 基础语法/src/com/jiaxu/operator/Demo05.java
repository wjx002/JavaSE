package com.jiaxu.operator;

/**
 * @Author：吴家旭
 * @date：2021/3/9 - 21:46
 */
public class Demo05 {
    public static void main(String[] args) {
        //逻辑运算符
        //与（and） 或（or） 非（取反）
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b = " + (a && b));  //逻辑与运算：两个为真才为真
        System.out.println("(a||b) = " + (a || b));//逻辑或运算：两个一个为真就为真
        System.out.println("(!(a&&b)) = " + (!(a && b)));//如果真则假，如果假则为真

        //短路运算
        int c = 5;
        //c<4是错的，然后后面&&就不执行了，故c还是等于5
        boolean d =(c<4)&&(c++<4);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
    }
}
