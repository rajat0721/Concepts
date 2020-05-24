package com.dsa.recurssion;

public class PowerOfNumber {

    public static void main(String[] args){
        //System.out.println(revese(123));
        System.out.println(powerOfNumber(12,revese(12)));
    }

    public static int revese(int n){
        int reverse_no=0;

        while (n>0){
            reverse_no = reverse_no*10 +n%10;
            n=n/10;
        }
        return reverse_no;
    }

    public static long powerOfNumber(int N,int K){

        if(K==0){
            return 1;
        }

        long my_no = N*powerOfNumber(N,K-1);

        return my_no%1000000007;
    }
}
