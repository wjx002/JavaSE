package com.jiaxu.struct;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 21:40
 */
public class ForDemo02 {
    public static void main(String[] args) {
        //0到100之间的奇数和偶数的和

        int oddSum = 0;
        int evenSun = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSun += i;
            }
        }
    }
}
