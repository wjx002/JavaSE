package com.jiaxu.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author:吴家旭
 * @date:2021/3/19 - 20:20
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1, 22, 335345, 434, 453, 5534, 53, 45};
        System.out.println(a);//[I@1b6d3586
        //打印数组元素
        System.out.println(Arrays.toString(a));
        //没必要重复造轮子
        Arrays.sort(a);//对数组排序：升序
        System.out.println(Arrays.toString(a));
        //fill填充方法
        Arrays.fill(a, 0);//全部填充为0
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,2,4,1);//从index为2到4之间填充为1,不包括4
        System.out.println(Arrays.toString(a));


    }
}
