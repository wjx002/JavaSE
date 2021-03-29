package com.oop.demo09;

public interface UserService {
    //接口中的所有定义的方法其实都是抽象的 public abstract
    //接口都需有有一个实现类

    //常量：接口里面定义的都是常量
    //public static final
    int AGE = 99;
    void run(String naem);

    void add(String name);

    void delete(String name);

    void updata(String name);

    void query(String name);
}
