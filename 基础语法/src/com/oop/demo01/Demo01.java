package com.oop.demo01;

import java.io.IOException;

/**
 * @Author:吴家旭
 * @date:2021/3/20 - 21:16
 */
//Demo01 ：类
public class Demo01 {

    //main方法
    public static void main(String[] args) {

    }

    /*
    修饰符  返回值类型   方法名（）{
        //方法体
        return 返回值;
    }
     */

    public String sayHello(){
        return "hello,world!";
    }


    public void hello(){
        return;
    }

    public int man(int a, int b) {
        return a > b ? a : b;//三元运算符！
    }

//比如数组越界
    public void readFile(String file) throws IOException {

    }
}
