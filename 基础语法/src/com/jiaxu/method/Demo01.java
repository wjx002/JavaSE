package com.jiaxu.method;

/**
 * @Author：吴家旭
 * @date：2021/3/15 - 10:37
 */
public class Demo01 {
    //main方法
    public static void main(String[] args) {

        //实际参数：实际调用传递给他的参数
        int sum= add(1, 2);
        System.out.println("sum = " + sum);
//        test();
    }
    //加法
    //形式参数，用于定义作用的
    public static int add(int a ,int b){

        return a+b;
    }


    public static  void test(){
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
