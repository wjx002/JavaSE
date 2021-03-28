package com.oop.demo05;

/**
 * @Author:吴家旭
 * @date:2021/3/23 - 21:49
 */
//学生是人
    //子类继承父类，就会继承父类的所有方法
public class Student extends Person{
    private String Name="qingjiang";

    public void print() {
        System.out.println("Sutdent");

    }

    public void test1() {
        print();
        this.print();
        super.print();
    }

    public Student() {
        //相当于隐藏了super（）；
        super();//调用父类构造器，必须放在子类构造器的第一行
        System.out.println("Student无参构造执行了");
    }
}
