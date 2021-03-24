package com.jiaxu.scanner;

import java.util.Scanner;

/**
 * @Author：吴家旭
 * @date：2021/3/12 - 21:26
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next凡是接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入的字符串为：" + str);


        }
        //凡是属于IO流的类如果不关闭就会一直占用资源，要养成好习惯用完就关掉

        scanner.close();
    }
}
