package com.jiaxu.struct;

import java.util.Scanner;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 20:57
 */
public class IfDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("shuruchengji");
        int score = scanner.nextInt();
        if (score > 60) {
            System.out.println("jigele");
        }else {
            System.out.println("bujige");
        }

        scanner.close();
    }
}
