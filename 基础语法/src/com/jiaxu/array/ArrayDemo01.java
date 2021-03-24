package com.jiaxu.array;

/**
 * @Author:吴家旭
 * @date:2021/3/17 - 20:13
 */
public class ArrayDemo01 {
    //变量类型     变量名字     =  变量的值；
    //数组类型

    public static void main(String[] args) {
        int[] nums;//定义   常用  声明了一个数组
        //这是早些年为了c++程序员转到java而是用的写法，一般不用  int num[]

        nums = new int[10];//这里面可以存放10个int类型的数字  创建了一个数组

        //给数组元素赋值
        nums[0]=1;
        nums[1]=7;
        nums[2]=6;
        nums[3]=5;
        nums[4]=4;
        nums[5]=3;
        nums[6]=2;
        nums[7]=1;
        nums[8]=1;
        nums[9]=1;

        System.out.println(nums.length);
        System.out.println(nums[9]);//int 数组的默认值是0

        //计算所有元素的和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
