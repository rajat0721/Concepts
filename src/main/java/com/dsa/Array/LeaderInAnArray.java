package com.dsa.Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInAnArray {

    public static void main(String[] args){

        int[] arr = {5,3,20,15,8,3};
        leader(arr);
    }

    public static void leader(int[] arr){
         int n,max = 0;
        ArrayList<Integer> a = new ArrayList<>();
         for(n=arr.length-1;n>=0;n--){
             if(arr[n]>max){
                 System.out.print(arr[n]+" ");
                 a.add(arr[n]);
                 max=arr[n];
             }
             Collections.sort(a,Collections.reverseOrder());
         }
    }
}

