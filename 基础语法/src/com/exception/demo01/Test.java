package com.exception.demo01;

public class Test {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;



        //finally可以不要，假设IO资源 就可以放在finally来关闭


        //快捷键  Ctrl + Alt + T
    }

    //假设这个方法中，没办法处理这个异常，方法向上抛出异常
    //用throws
    public void test(int a,int b) throws ArithmeticException{
        //假设要去捕获多个异常，要从小到大
        try {//监控区域
            //System.out.println(a / b);
//            new Test().a();

            if (b == 0) {
                throw new ArithmeticException();//主动抛出异常  一般在方法中使用
            }

        } catch (Throwable e) {//捕获异常
            //System.out.println("程序出现异常，变量b不可以为0");

        }finally {//处理善后工作，一定会执行
            System.out.println("finally");
        }
    }

    public void a() {
        b();
    }

    public void b() {
        a();
    }
    }
