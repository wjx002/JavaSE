package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/14 - 21:58
 */
public class ContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 200) {
            i++;
            if (i%10==0) {
                System.out.println();
                continue;
            }
            System.out.println(i);
        }

    }
}
