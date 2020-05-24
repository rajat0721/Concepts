package com.dsa.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseinGroup {

    public static void main(String[] args){

        ArrayList<Integer> mv = new ArrayList<Integer>(Arrays.asList(1,2,3));
        reverseInGroups(mv,3,4);
        System.out.println(mv);
    }

    public static void reverseInGroups(ArrayList<Integer> mv, int n, int k) {

        if(k>n)
            Collections.reverse(mv);
        //return mv;
    }

}
