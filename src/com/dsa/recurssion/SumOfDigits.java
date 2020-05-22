package com.dsa.recurssion;

import java.util.function.DoubleToIntFunction;

public class SumOfDigits {

    public static void main(String[] args){
        System.out.println(sum(225));
    }
    //245
    //5
    //25
    public static int sum(int n){
        if(n<10)
            return n;
        return sum(n/10) + n%10;
    }
}
