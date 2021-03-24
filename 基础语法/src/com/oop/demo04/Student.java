package com.oop.demo04;

/**
 * @Author:吴家旭
 * @date:2021/3/23 - 21:18
 */
public class Student {


    //private 私有的
    //名字
    //学号
    //性别
    //属性私有：
    private String name;
    private int id;
    private char sex;
    private int age;


//学习（）


    //睡觉（）

    //提供一些可以操作这些属性的方法
    //提供一些public的get set方法


    //get 获取这个数据
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    //set 设置值
    public void setName(){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {//不合法
            this.age = 3;
        } else {
            this.age = age;
        }

    }
}
