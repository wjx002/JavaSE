package com.jiaxu.scanner;

import java.util.Scanner;

/**
 * @Author：吴家旭
 * @date：2021/3/12 - 21:46
 */
public class Demo05 {
    public static void main(String[] args) {
        //我们要输入多个数字，并求其总和与平均数，没输入一个数字用回车确认，
        //通过输入非数字结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);
        //和
        double sum = 0;
        //计算输入多少个数字
        int num = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            num += 1;
            sum += x;
            System.out.println("你输入了第"+num+"个数据，目前总和sum为"+sum);
        }
        System.out.println("num = " + num);
        System.out.println("(sum/num) = " + (sum / num));
        scanner.close();
    }
}
