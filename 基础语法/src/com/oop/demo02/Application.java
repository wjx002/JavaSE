package com.oop.demo02;

/**
 * @Author:吴家旭
 * @date:2021/3/20 - 22:00
 */

//一个项目应该只存在一个main方法
public class Application {

    public static void main(String[] args) {

        //类：抽象的，实例化
        //类实例化会返回自己的对象
        //student对象就是一个Student类的具体实例

        Student xiaoming = new Student();
        Student xiaohong = new Student();
        xiaoming.name = "小明";
        xiaoming.age = 3;
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        xiaohong.age = 2;
        xiaohong.name = "小红";
        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);



        //new 实例化了一个对象
        Person person = new Person();
        //new一个有参对象
        Person person1 = new Person("jiaxu");

    }
}
