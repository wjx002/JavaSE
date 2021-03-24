package com.jiaxu.base;

/**
 * @Author：吴家旭
 * @date：2021/3/9 - 20:29
 */
public class Demo07 {

    //类变量static
    static double salary = 2500;


    //属性：变量

    //实例变量：从属于对象; 如果不初始化，自动赋值为0或者0.0
    //布尔值：默认为false
    //除了基本类型，其余的默认值都为null
    String name;
    int age;


    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i = 10;

        //变量类型  变量名字 = new com.jiaxu.base.Demo07
        Demo07 demo07 = new Demo07();
        System.out.println("demo07.age = " + demo07.age);
        System.out.println("demo07.name = " + demo07.name);
        System.out.println("i = " + i);
        //类变量 static
        System.out.println("salary = " + salary);
    }

    //其他方法
    public void add(){

    }
}
