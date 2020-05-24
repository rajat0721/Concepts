package com.dsa.recurssion;

public class TowerOfHanoi {
    public static void main(String[] args){

        toh(1,'a','b','c');
        System.out.println(TowerOfHanoi.moves);
    }

    public static long moves;
    //nuber of discs
    //from_rod
    //aux_rod
    //to_rod
    // toh(n-1,from_rod,)
    public static void toh(int n,char from_rod,char to_rod, char aux_rod){

        if(n==1)
        {System.out.println("move disc 1 from "+ from_rod + " to " + to_rod);
        moves=( long ) Math.pow( 2 ,  n) -1;
        return;}
        toh(n-1,from_rod,aux_rod,to_rod);
        System.out.println("move disc "+ n +" from "+ from_rod + " to " + to_rod);
        toh(n-1,aux_rod,to_rod,from_rod);
        moves=( long ) Math.pow( 2 ,  n) -1;
    }

}
