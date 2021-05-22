package com.wen.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(a[0]);

        //动态初始化 : 包含默认初始化
        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);

        //创建数组后未赋值，则数组元素值默认为0
        System.out.println(b[1]);
        System.out.println(b[2]);


        int[] c = new int[2];
        System.out.println(c[2]);
    }
}
