package com.dsa.recurssion;


public class Recursion {

    public static void main(String[] args) {
        printRecurssion(5);
        //inversePrintRecurssion(5);
        //inversePrintTailRecurssion(5,1);
        //System.out.println(factorial(4));
        //System.out.println(factTail(4,1));

        String a="abba";
        //System.out.println(isPallindrome(a,0,a.length()-1));
        System.out.println(jos(7,1));

    }

//Tail recusive function -> !. Function ending with recursive call are Tail recursive.
    // 2. Tail recusive are faster than non-tail recursive functions.
    // 3. Eg:- printRecurssion and inversePrintRecurssion, Quick(Tail Recursive) an merge sort.
    public static void printRecurssion(int number) //without using loop
    {
        if (number < 1) {
            return;
        }
        System.out.println(number);
        printRecurssion(number - 1);
    }

    public static void inversePrintRecurssion(int number) //without using loop
    {
        if (number < 1) {
            return;
        }
        inversePrintRecurssion(number - 1);
        System.out.println(number);
    }

    //Tail Recursive version of inversePrintRecurssion

    public static void inversePrintTailRecurssion(int number, int k) //without using loop
    {
        if (number < 1) {
            return;
        }
        System.out.println(k);
        inversePrintTailRecurssion(number - 1,k+1);
        //System.out.println(number);
    }

    //Factorial
    public static int factorial(int num){
        if(num<1){
            return 1;
        }
        return num*factorial(num-1);
    }
    // Factorial Tail recursive
    public static int factTail(int num, int val){
        if(num<1){
            return val;
        }
        //System.out.println(num+"  "+val);
        return factTail(num-1,num*val);
    }

    //Pallindrome
    // starting index s and ending index e
    // str1=aabaa
    //str2 = abba
    public static boolean isPallindrome(String str, int s, int e){

        if (s==e)return true;
        if (s>e)return true;
        if(str.charAt(s)!=str.charAt(e))
            return false;
        return isPallindrome(str,s+1,e-1);
    }

    //Josephus problem
    public static int jos(int n,int k){
        if(n==1){
            return n;
        }
        return (jos(n-1,k)+(k-1)) % n + 1;
    }

    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p==0)
            return 1;

        return n*RecursivePower(n,p-1);
    }

    public static int digitalRoot(int n)
    {
        // add your code here
        if(n<10)
            return n;

        int sum = digitalRoot(n/10)+n%10;
        if(sum>=10)
            sum = digitalRoot(sum/10)+sum%10;

        return sum;
    }


}
