package com.dsa.recurssion;

public class Print {

    public static void main(String[] args){
        //print(5);
        invPrint(64);
    }

    public static void print(int n){
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }

    public static void invPrint(int n){
        if(n==0)
            return;
        invPrint(n-1);
        System.out.println();
    }
}