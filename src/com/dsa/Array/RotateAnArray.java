package com.dsa.Array;

import static com.dsa.Array.ArrayUtil.printArray;
import static com.dsa.Array.ReverseArray.reverseSwap;

public class RotateAnArray {

    public static void main(String[] args){

        int[] arr={1,2,3,4,5};
        int[] ans,ans1;

        ans = rotate(arr,3);
        printArray(ans);
    }

    public static int[] rotate(int[] arr,int d){

        arr=reverseSwap(arr,0,d-1);
        arr=reverseSwap(arr,d,arr.length-1);
        arr=reverseSwap(arr,0,arr.length-1);

        return arr;
    }
}
