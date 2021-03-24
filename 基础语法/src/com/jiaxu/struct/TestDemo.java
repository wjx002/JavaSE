package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/14 - 22:07
 */
public class TestDemo {
    public static void main(String[] args) {
        //打印三角形 5行
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 0;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
