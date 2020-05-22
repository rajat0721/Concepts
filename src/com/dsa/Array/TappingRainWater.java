package com.dsa.Array;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class TappingRainWater {

    public static void main(String[] args){

        int[] arr = {1,2,3};
        rainWater(arr);
    }

    public static int rainWater(int[] arr){

        int n = arr.length -1;
        int[] left = new int [n+1];
        int[] right = new int [n+1];
        left[0] = arr[0];
        for (int i=1;i<=n;i++){
            left[i] = max(left[i-1],arr[i]);
        }

        right[n] = arr[n];
        for(int j=n-1;j>=0;j--){
            right[j] = max(right[j+1],arr[j]);
        }

        int water=0;
        //ReverseArray.printArray(left);
        //ReverseArray.printArray(right);

        System.out.println(left.length);
        System.out.println(right.length);
        System.out.println(arr.length);
        for(int k=0;k<arr.length-1;k++){
            water = water+(min(left[k],right[k])-arr[k]);
        }
        return water;
    }
}
