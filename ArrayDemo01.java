package com.wen.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //变量的类型     变量的名字   =   变量的值
        //数组类型

        int[] nums;     //1. 声明一个数组

        nums = new int[10];     //2.创建一个数组

        //3. 给数组元素中赋值

        for(int i = 0;i<nums.length;i++){
            nums[i] = i+1;
        }

        //计算所有元素之和
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        System.out.println(sum);
    }
}
