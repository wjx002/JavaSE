package com.jiaxu.base;

/**
 * @Author：吴家旭
 * @date：2021/3/9 - 20:06
 */
public class Demo05 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性,数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total1 = money * years;//-1474836480 内存溢出
        System.out.println(money);
        System.out.println(total1);
        long total2 = money * years;
        System.out.println(total2);//默认是int，转换之前已经存在问题了
        long total3 = money * (long) years;//正确了，先进行类型转换为long，整个计算就会以long类型为基础计算
        System.out.println("total3 = " + total3);


    }
}
