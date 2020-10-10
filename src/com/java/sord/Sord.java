package com.java.sord;

import java.util.Arrays;

/***
 * 普通的排序算法
 */
public class Sord {

    public static void main(String[] args) {

        int[] arr = {2, 7, 3, 5, 1};
//        int[] ints = bubbleSort(arr);
        int[] ints = selectionSort(arr);

        System.out.println(ints);

    }

    // 1. 冒泡排序
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // 2. 选择排序
    public static int[] selectionSort(int[] arr) {

        int minIndex, temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // 3.插入排序
    public static int[] insertSord(int[] arr){


        return null;
    }



}
