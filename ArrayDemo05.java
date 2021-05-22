package com.wen.array;

import java.util.jar.JarEntry;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //多维数组
        /*
            1,2     array[0]
            3,4     array[1]
            5,6     array[2]
         */
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        printArray(array[0]);
        System.out.println();
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

}
