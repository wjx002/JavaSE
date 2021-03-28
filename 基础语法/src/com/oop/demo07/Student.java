package com.oop.demo07;
//static ：
public class Student {
    private static int age;//静态的变量
    private double score; //非静态变量

    public void run() {
        go();
    }

    public static void go() {

    }

    public static void main(String[] args) {
        go();
        //run();//爆红
    }

}
