package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/14 - 21:48
 */
public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};//初始化数组
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("==========");
        //将numbers循环赋值给i，遍历数组的元素
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
