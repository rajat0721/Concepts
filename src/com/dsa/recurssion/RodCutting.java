package com.dsa.recurssion;

import static sun.swing.MenuItemLayoutHelper.max;

public class RodCutting {

    public static void main(String[] args){
        System.out.println(rodCut(23,11,9,12));
        System.out.println(rodCut(5,2,1,5));
    }

    public static int rodCut(int n, int a, int b,int c){
        if(n<0)
            return -1;
        if(n==0)
            return 0;
        return max(rodCut(n-a,a,b,c),rodCut(n-b,a,b,c),rodCut(n-c,a,b,c)) + 1;
    }
}
