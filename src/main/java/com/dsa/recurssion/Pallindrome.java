package com.dsa.recurssion;

public class Pallindrome {

    public static void main(String[] args){

        String s="aabbaa";
        System.out.println(pallindrome(s,0,s.length()-1));
    }

    public static boolean pallindrome(String str,int startInd, int endIndex){

        if(str.charAt(startInd)!=str.charAt(endIndex))
            return false;
        if(startInd>=endIndex)
            return true;
        return pallindrome(str,startInd+1,endIndex-1);
    }

}
