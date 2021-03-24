package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 21:27
 */
public class WhileDemo03 {
    public static void main(String[] args) {
        //计算1+....+100
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
