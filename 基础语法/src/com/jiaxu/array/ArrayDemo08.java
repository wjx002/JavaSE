package com.jiaxu.array;

/**
 * @Author:吴家旭
 * @date:2021/3/19 - 21:12
 */
public class ArrayDemo08 {
    public static void main(String[] args) {
        //1.创建一个二维数组11*11
        /*
        0就是没有棋子
        1就是黑棋
        2就是白棋
         */
        //创建一个二维数组11*11
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        //输出原始数组
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("======================================================");


        //转化为一个稀疏数组
        //用sum记录有效数字
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    sum++;
                }
            }
        }

        System.out.println("有效数字为" + sum);

        //创建一个稀疏数组
        int[][] array2 = new int[sum + 1][3];//为什么是sum+1呢，就是因为有一个头来表示多少行多少列
        array2[0][0]=array1.length;
        array2[0][1]=array1[0].length;
        array2[0][2] = sum;

        //遍历数组，将非零数字存入稀疏数组中，用count来记录行数
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];

                }
            }
        }

        System.out.println("输出稀疏数组");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i][0] + "\t" + array2[i][1] + "\t" + array2[i][2]);
            System.out.println();
        }



        //稀疏数组还原成二维数组

        System.out.println("===============================================");


        //创建一个二维数组接收还原的数组
        int[][] array3 = new int[array2[0][0]][array2[0][0]];

        //将稀疏数组遍历赋值给二维数组
        for (int i = 1; i <array2.length ; i++) {
            array3[array2[i][0]][array2[i][1]] =array2[i][2];
        }

        //输出还原后的数组
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }

            System.out.println();
        }





    }
}
