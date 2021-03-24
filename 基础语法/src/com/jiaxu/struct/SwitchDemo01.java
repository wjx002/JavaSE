package com.jiaxu.struct;

import java.util.Scanner;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 21:09
 */
public class SwitchDemo01 {
    public static void main(String[] args) {
        char grade = 'C';
        Scanner scanner = new Scanner(System.in);
        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("bukanl");
        }
        scanner.close();
    }
}
