package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 21:31
 */
public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);
    }
}
