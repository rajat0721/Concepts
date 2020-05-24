package com.dsa.Array;

import static com.dsa.Array.ArrayUtil.printArray;
import static com.dsa.Array.ArrayUtil.swap;

public class ReverseArray {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] ans,ans1;
        ans1= reverse(arr);
        ans = reverseSwap(arr,0,arr.length-1);
        printArray(ans);
    }

    public static int[] reverse(int[] arr){
        int i;
        int b[] = new int[arr.length];
        for (i=0; i<arr.length;i++) {
            b[arr.length-1-i]=arr[i];
        }
        return b;
    }

    public static int[] reverseSwap(int[] arr,int low,int high){
        while (low<high){
            arr=swap(arr,low,high);
            low++;
            high--;
        }
        return arr;
    }




}
