package com.oop.demo01;

/**
 * @Author:吴家旭
 * @date:2021/3/20 - 21:26
 */
//学生类
public class Student {

    //非静态方法
    public void say(){
        System.out.println("学生说话了");
    }

/*
静态方法也就是 static 方法是和类一起加载的，很早很早就存在了
非静态方法就是在类实例化之后才存在的，也就是在new之后才算数的
所以静态方法里面无法调用非静态方法
就是存在的东西不能去调用不存在的东西
但是static静态方法可以调用静态方法
非静态也可以调用非静态的方法
非静态也可以调用静态方法，因为当非静态方法可以调用时，静态方法早就存在了
所以存在可以调用存在，所以可以调用static方法
 */


    public static void a() {

    }
    //类实例化之后才存在的
    public void b() {
        a();
    }
}
