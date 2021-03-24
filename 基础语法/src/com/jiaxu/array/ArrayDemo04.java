package com.jiaxu.array;

import java.util.Iterator;

/**
 * @Author:吴家旭
 * @date:2021/3/17 - 21:46
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        //JDK,没有下标
        //适合输出，没有下标
        for (int array : arrays) {
            System.out.println(array);
        }
        System.out.println("==========");
        printArray(arrays);
        System.out.println("===========");
        int[] result = reverse(arrays);
        printArray(result);

    }


    //打印数组元素
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]+" ");
        }
    }

    //翻转数组
    public static int[] reverse(int[] arrays) {
        int[] result = new int[arrays.length];
        //翻转的操作
        for (int i = 0, j = result.length - 1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }

        return result;
    }
}
