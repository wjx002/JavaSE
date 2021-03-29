package com.oop;


import com.oop.demo05.A;
import com.oop.demo05.B;
import com.oop.demo06.Person;
import com.oop.demo06.Student;
import com.oop.demo06.Teacher;
import com.oop.demo10.Outer;

/**
 * @Author:吴家旭
 * @date:2021/3/23 - 20:29
 */
public class Application {
    //静态的方法和非静态的方法区别很大
    //
    public static void main(String[] args) {

//

        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.getId();

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

//        Student student1 = new Student();
//        student1.say();
//静态方法：方法的调用只和左边，定义的数据类型有关
//非静态方法：才可以重写，重写只能重写public
//重写只存在于父子继承中
//        A a = new A();
//        a.test();
//        //父类的引用指向了子类
//        B b = new A();
//        b.test();

//        //一个对象的实际类型是确定的
//
//        //可以指向的引用类型是不确定的
//        //父类的引用指向子类
//        Student s1 = new Student();
//        Person s2 = new Student();
//        Object s3 = new Student();
//
//        s2.run();//子类重写了父类的方法，执行了子类的方法
//
//
//        //Student 能调用的方法都是自己的或者继承父类的
//        //Person是父类型，可以指向子类，但是不能调用子类独有的方法
//
//        //对象能执行什么方法，主要看对象左边的类型，和右边关系不大
//        //s2.eat();直接报错，需要进行类型装换
//        s1.eat();

    //object>string
    //object>person>teacher
    //object>person>student
    //
//    Object object = new Student();

//instanceof  判断两个类是否存在父子关系，是则true，否这false
//        System.out.println(object instanceof Student);//true
//                System.out.println(object instanceof Person);//true
//                System.out.println(object instanceof Object);//true
//                System.out.println(object instanceof Teacher);//false
//                System.out.println(object instanceof String);//false
//
//                Person person = new Student();
//
//                //instanceof  判断两个类是否存在父子关系，是则true，否这false
//                System.out.println(person instanceof Student);//true
//                System.out.println(person instanceof Person);//true
//                System.out.println(person instanceof Object);//true
//                System.out.println(person instanceof Teacher);//false
//                //System.out.println(person instanceof String);//编译报错！
//
//                Student student = new Student();
//
//                //instanceof  判断两个类是否存在父子关系，是则true，否这false
//                System.out.println(student instanceof Student);//true
//                System.out.println(student instanceof Person);//true
//                System.out.println(student instanceof Object);//true
//System.out.println(student instanceof Teacher);//编译报错
//System.out.println(person instanceof String);//编译报错！

//类型之间的转化： 父        子
//        //高    低
//        Person obj = new Student();
//
//        //student这个对象转换为Student类型，我们就可以使用Student的方法了
//
////        Student student = (Student) obj;
//        ((Student) obj).go();
//
//        //子类转换为父类，可能丢失本来自己的一些方法
//        Student student = new Student();
//        Person person = student;