package com.dsa.recurssion;

public class Factorial {

    public static void main(String[] args){
        System.out.println(fact(3));
        System.out.println(factTail(4,1));
    }

    public static int fact(int n){

        if (n==1)
            return 1;
        return n*fact(n-1);
    }

    public static int factTail(int n,int val){

        if (n==1)
            return val;
        return factTail(n-1,n*val);
    }
}
