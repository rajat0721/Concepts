package com.dsa.Array;

public class ArrayUtil {
    public static int[] swap(int[] arr,int low,int high){
        int temp;
        temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
