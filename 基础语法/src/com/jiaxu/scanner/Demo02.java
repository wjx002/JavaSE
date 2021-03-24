package com.jiaxu.scanner;

import java.util.Scanner;

/**
 * @Author：吴家旭
 * @date：2021/3/12 - 21:31
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine()接收：");
        //判断是否还有没有输入
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输入的字符串为：" + str);

        }
        scanner.close();
    }
}
