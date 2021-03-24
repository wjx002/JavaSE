package com.jiaxu.base;

/**
 * @Author：吴家旭
 * @date：2021/3/9 - 19:53
 */
public class Demo04 {
    public static void main(String[] args) {
        int i = 128;
        //如果这时候b是double型就没事
        byte b = (byte) i;//如果没有进行强制转换则会报错， 需要一个byte类型但是i是一个int类型
        //上面b内存溢出
        //强制转换    （类型）变量名   高到低
        //自动类型转换  低---高
        System.out.println(i);
        System.out.println(b);
        //这时候b = -128，因为内存溢出 byte最大为127

        /*
        * 注意点：
        * 1.不能对布尔值进行转黄
        * 2.不能吧对象类型转换为不相干的类型
        * 3.再把高容量转换到低容量的时候，强制装换
        * 4.转换的时候可能存在内存溢出，或者精度问题
        * */
        System.out.println("==============");
        System.out.println((int)23.7);  //23  精度问题
        System.out.println((int)-45.89f); // -45

        System.out.println("===========");
        char c = 'a';
        int d = c + 1;
        System.out.println(d);
        System.out.println((char) d);
    }
}
