package com.jiaxu.operator;

/**
 * @Author：吴家旭
 * @date：2021/3/10 - 21:51
 */
//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        //x ? y : z
        //如果x==true，则结果为y，否则结果为z
        int score = 80;
        String type = score < 60 ? "不及格" : "及格";
        //if
        System.out.println(type);

    }
}
