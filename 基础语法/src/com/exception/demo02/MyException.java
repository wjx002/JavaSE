package com.exception.demo02;

public class MyException extends Exception{
    //传递数字》10
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    //异常的打印信息：toString

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
