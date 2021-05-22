package com.wen.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9090,31231,543,21,3,23};

        //打印数组元素
        System.out.println(a);  //输出hash code:[I@1b6d3586

        System.out.println(Arrays.toString(a)); //打印数组
        printarray(a);      //自己编写打印数组方法

        Arrays.sort(a); //数组进行排序

        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2,4,0);   //数组的第2到4个元素被0填充
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,0);   //数组填充
        System.out.println(Arrays.toString(a));
    }
    public static void printarray (int []a){
        for (int i = 0; i <a.length ; i++) {
            if(i==0)
            {
                System.out.print("{");
            }
            System.out.print(a[i]+",");
            if(i==a.length-1){
                System.out.println("}");
            }
        }
    }
}
