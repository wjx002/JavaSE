package com.jiaxu.base;

/**
 * @Author：吴家旭
 * @date：2021/3/9 - 9:46
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
        * 整数拓展：
        * 进制   二进制0b   十进制    八进制0      十六进制0x
        * */
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("====================");
        /*
        * 浮点数拓展：
        * 银行业务怎么表示？钱
        * 用BigDecimal 数学工具类
        * float      有限 离散 舍入误差 大约 接近但不等于
        * double
        * */

        //最好完全不要使用浮点数进行比较
        //最好完全不要使用浮点数进行比较
        //最好完全不要使用浮点数进行比较
        //最好完全不要使用浮点数进行比较
        float f = 0.1f;
        double d = 1.0 / 10;
        System.out.println(f == d);//返回的是False
        System.out.println(f);
        System.out.println(d);
        float d1 = 12344567789239474f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);//结果竟然是true

        System.out.println("====================");
        //字符拓展？

        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        System.out.println((int) c2);//强制转换
        //所有的字符本质还是数字
        //编码 Unicode 表：97 ='a' 2字节 0-65536   Excel 2的16次幂 = 65536


        //u00000   uFFFFF
        char c3 = '\u0061';
        System.out.println(c3);  //a

        //转义字符
        // \t 制表符
        // \n 换行
        //。。。。
        System.out.println("Hello\tWorld");
        System.out.println("=====================");

        String sa =new  String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);  //这个是false

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd); //这个是true

        //为什么sa == sb 是错的，sc等于sd是对的
        //这个得从对象  内存分析




        //布尔值拓展
        boolean flag = true;
        if (flag ==true){} //新手才会写flag == true  ，因为flag就是true了，所以有些多于
        if(flag){//老手
            //代码要精简 less is more
        }


    }
}
