package com.jiaxu.method;

/**
 * @Author：吴家旭
 * @date：2021/3/15 - 20:55
 */
public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,3,4,5,6);
        printMax(new double[]{1,2,3});
    }

    public void test(int... i) {
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("it is null");
            return;
        }
        double result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println(result);
    }
}
