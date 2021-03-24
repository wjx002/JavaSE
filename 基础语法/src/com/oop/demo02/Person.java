package com.oop.demo02;

/**
 * @Author:吴家旭
 * @date:2021/3/23 - 20:08
 */
public class Person {
    //一个类即使什么都没有写，它也会有一个方法
    //显示的定义构造器

    String name;

    //实例化初始值
    //1.使用new关键字，本质就是调用构造器
    public Person(){
    }


    //有参构造：一旦定义了有参构造，无参就必须显示定义
    public Person(String name) {
        this.name = name;
    }

    //alt+insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
