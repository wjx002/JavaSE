package com.oop.demo08;
//抽象类 abstract 类 extends ：单继承   没有多继承
//但是  接口 可以多继承
public abstract class Action {

    //约束~有人帮我们实现
    //astract 抽象方法，只有名字，没有方法的实现！
    public abstract void doSomething();

    //1.不能new这个抽象类，只能靠子类去实现它；约束！
    //2.抽象类里面可以写普通的方法
    //3.抽象方法只能写在抽象类中
    //抽象的抽象：约束

    //思考题？
    //抽象类不能new对象，抽象类还有构造器吗   **有构造器
    //抽象类存在的意义    **提高开发效率，减少代码，提取共同方法，
}
