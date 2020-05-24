package com.dsa.recurssion;

import java.util.ArrayList;
import java.util.Collections;

public class LexSort {

    public static void main(String[] args){

        ArrayList<String> ans = powerSet("abc");
        Collections.sort(ans);
        for(String s:ans){
            System.out.print(s+" ");
        }

    }

    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> set=new ArrayList<String>();
        ArrayList<String> ans = sub(s,set,0,"");
        return ans;
    }

    public static ArrayList<String> sub(String s,ArrayList<String> set,int index,String curr){
        if(index==s.length()){
            set.add(curr);
            return set;
        }
        sub(s,set,index+1,curr);
        sub(s,set,index+1,curr+s.charAt(index));

        return set;
    }

}
