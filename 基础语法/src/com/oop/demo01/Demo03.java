package com.oop.demo01;

/**
 * @Author:吴家旭
 * @date:2021/3/20 - 21:37
 */
//引用传递：对象，本质还是值传递
public class Demo03 {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);
        Demo03.change(person);
        System.out.println(person.name);

    }

    public static void change(Person person) {
        //person是一个对象，指向的是----->Person person = new Person();
        //是一个具体的人，可以改变属性
        person.name = "家旭";
    }


    //定义一个person类，有一个属性name
    static class Person{
        String name;
    }
}
