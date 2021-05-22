package com.wen.array;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.jar.JarEntry;

public class ArrayDemo07 {
    public static void main(String[] args) {
    int[] a={1,2,70,123,10000,12,55};
    a=sort(a);
        System.out.println(Arrays.toString(a));
    }

    //冒泡排序
    //1、比较数组中，两个相邻元素，如果第一个数比第二个数大，就交换它们的位置
    //2、每一次比较中，都会产生出一个最大，或最小的数字；
    //3、下一轮则可以少一次排序
    //4、依次循环，直到结束。

    public static int[] sort(int[] array){
        //临时变量
        int temp = 0;

        //外层循环，判断我们这个要走多少次
        for (int i = array.length-1; i >0 ; i--) {
            //内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            for (int j =i-1; j >=0; j--){
                if(array[j]>array[i])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
