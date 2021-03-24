package com.oop;


import com.oop.demo05.Student;

/**
 * @Author:吴家旭
 * @date:2021/3/23 - 20:29
 */
public class Application {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.say();

    }




}
 /*
    1.类与对象
         类是一个模板 抽象的，对象是一个具体实例
    2.方法
        定义、调用！
    3.对象的引用
        引用类型        基本类型（8个）
        对象是通过引用来操作的： 栈----->堆
    4.属性：字段field 成员变量
        默认初始化：
            数字：0  0.0
            char：u0000
            boolean：false
            引用：null
        修饰符  属性类型  属性名 = 属性值;
    5.对象的创建和使用：
        1.必须使用new关键字创建对象，构造器  Person 家旭 = new Person();
        2.对象的属性：家旭.name
        3.对象的方法：家旭.sleep();

    6.类：
        静态的属性   属性
        动态的行为   方法

        三大特性：封装、继承、多态
     */