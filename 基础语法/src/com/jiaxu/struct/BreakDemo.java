package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/14 - 21:56
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 200) {
            i++;
            if (i == 30) {
                System.out.println("到30为止");
                break;
            }
        }
        System.out.println("2123s");
    }
}
