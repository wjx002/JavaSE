package com.jiaxu.method;

/**
 * @Author：吴家旭
 * @date：2021/3/15 - 10:55
 */
public class Demo02 {
    public static void main(String[] args) {
        int max = max(1, 2);
        System.out.println("max = " + max);
    }


    //比较大小
    public static int max(int a,int b){
        int temp=0;
        if(a>b){
            temp = a;
        } else if (a < b) {
            temp = b;
        }else{
            System.out.println("xiangdeng");
            return 0;//终止方法
        }
        return temp;
    }
}
