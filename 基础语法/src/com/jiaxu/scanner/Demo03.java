package com.jiaxu.scanner;

import java.util.Scanner;

/**
 * @Author：吴家旭
 * @date：2021/3/12 - 21:38
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        String str = scanner.nextLine();
        System.out.println("输入的字符串为：" + str);
        scanner.close();
    }
}
