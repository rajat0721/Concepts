package com.dsa.recurssion;

public class SubsetOfString {
    public static void main(String[] args){
        String a="ABC";
        subSet(a,0,"");
    }

    public static void subSet(String str,int i,String cur){

        //System.out.println(i+" "+str.length());
        if(i==str.length()){
            System.out.println(cur);
            return;
        }
        subSet(str,i+1,cur);
        subSet(str,i+1,cur + ""+str.charAt(i));
    }
}