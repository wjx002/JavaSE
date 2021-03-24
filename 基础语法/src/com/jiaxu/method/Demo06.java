package com.jiaxu.method;

import java.util.Scanner;

/**
 * @Author:吴家旭
 * @date:2021/3/15 - 21:29
 */
public class Demo06 {
    public static void main(String[] args) {
        boolean key = true;
        while (key){
            System.out.println("请选择：");
            menu();
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                System.out.println("请输入两个数字");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();

                switch (n){
                    case 1:
                        System.out.println(add(num1, num2));
                        break;
                    case 2:
                        System.out.println(less(num1, num2));
                        break;
                    case 3:
                        System.out.println(multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println(division(num1, num2));
                        break;
                    case 5:
                         key = false;
                         break;
                }
            }
            scanner.close();
        }
    }
    public static double add(double num1,double num2){
        return num1 + num2;
    }

    public static double less(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("无法计算");
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public static void menu(){
        System.out.println("=========================");
        System.out.println("=1、加法         2、减法  =");
        System.out.println("=3、乘法         4、除法  =");
        System.out.println("=        5、退出         =");
        System.out.println("=========================");
    }
}
