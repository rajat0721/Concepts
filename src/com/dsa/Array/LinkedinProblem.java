package com.dsa.Array;

import static com.dsa.Array.ArrayUtil.*;

public class LinkedinProblem {

    public static void main(String[] args){
        int[] arr = {5,4,2,6,3};
        answer(arr,arr.length);
    }

    public static void answer(int[] arr,int n){
        int left[] = new int[n],right[] = new int[n];
        int pointer = arr[n-1];
        int j=0,k=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]<=pointer) {
                left[j] = arr[i];
                j++;
                left[j] = pointer;
            }
            if(arr[i]>pointer){
                left[j]=arr[i];
            }
            j++;
        }
        printArray(arr);
        System.out.println();
        printArray(left);
        System.out.println();
        printArray(right);
    }
}

