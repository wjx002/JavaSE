package com.jiaxu.struct;

import java.util.Scanner;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 20:50
 */
public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input");
        String s = scanner.nextLine();

        //equals:判断字符串是否相等
        if (s.equals("Hello")) {
            System.out.println(s);
        }

        System.out.println("End");
        scanner.close();
    }
}
