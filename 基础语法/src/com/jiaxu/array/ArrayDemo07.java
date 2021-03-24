package com.jiaxu.array;

import java.util.SortedMap;

/**
 * @Author:吴家旭
 * @date:2021/3/19 - 20:36
 */
public class ArrayDemo07 {
    public static void main(String[] args) {

    }
    //冒泡排序
    /*
    1.比价数组中，两个相邻的元素，如果第二个数比第一个数大则调换位置
    2.每一次比较都会得出一个最大或者最小的数字
    3.下一轮则会少一次排序
    4.依次循环，直到结束
     */

    public static int[] sort(int[] a){
        //外层循环，判断我们这个要走多少次
        for (int i = 0; i < a.length - 1; i++) {
            //内存循环，比较判断两个数，如果第一个数，比第二个数小，则交换位置
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] > a[j]) {
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
