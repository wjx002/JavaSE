package com.oop.demo07;
//静态导入包
import static java.lang.Math.random;

public class Test {
    public static void main(String[] args) {
        System.out.println(random());
        //如果不加static，则本来的写法是
        System.out.println(Math.random());
    }
}
