package com.jiaxu.array;

/**
 * @Author:吴家旭
 * @date:2021/3/19 - 20:10
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        /*
        int[4][2] 四行两列数组

        1,2  array[0]
        2,3  array[1]
        3,4  array[2]
        4,5  array[3]
         */
        System.out.println(array[0][1]);
        System.out.println(array[0][0]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
            
        }

    }
}
