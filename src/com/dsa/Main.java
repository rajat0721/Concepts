package com.dsa;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void myFunc(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
         /* while(t-- > 0){
              int n = sc.nextInt();
              int k=sc.nextInt();

              Integer arr[] = new Integer[n];
              for(int i=0;i<n;i++){
                  arr[i]=sc.nextInt();
              }

              Map<Integer,Integer> map=new HashMap<>();
              while(k-- > 0){
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  for(int i=a;i<=b;i++){
                      map.put(i,map.getOrDefault(i,0)+1);
                  }
              }

//              System.out.println(map);
//
              long sumAlice = 0;
              long sumBob = 0;

              for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                  sumAlice+=(entry.getValue()*(arr[entry.getKey()-1]));
              }

//              System.out.println(sumAlice);

              List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
              list.sort(Map.Entry.comparingByValue());

              Map<Integer, Integer> result = new LinkedHashMap<>();
              for (Map.Entry<Integer, Integer> entry : list) {
                  result.put(entry.getKey(), entry.getValue());
              }

              Arrays.sort(arr);

              int h=Math.abs(arr.length-result.size());
              for(Map.Entry<Integer,Integer> entry: result.entrySet()){
                  sumBob+=(entry.getValue()*arr[h++]);
              }
//              System.out.println(sumBob);
              System.out.println(Math.abs((sumAlice-sumBob)));
          }*/



//        // write your code here
//        //problem1();
//        //problem2();
//        //problem3();
//        //problem4();
//        //problem5();
//        //problem6();
//        int i,count=0;
//        for(i=0;count<=10001;i++){
//            if(isPrime(i))
//                count++;
//            if (count==10001) {
//                System.out.println(i + " " + count);
//                break;
//            }
//        }
    }

    public static boolean isPrime(Integer num){
        int i, m = 0, flag = 0;
        m = num / 2;
        if (num == 0 || num == 1) {
            flag = 1;
            //System.out.println(num + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    //System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
        }
        return flag==0;
    }

    public static boolean isPalindrome(Integer number) {
        int r, sum = 0, temp;
        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }// reversing number
        return temp == sum;
    }


    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }


    public static void problem1() {
        Integer sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void problem2() {
        int maxNumber = 4000000;
        int answer = 0;
        int value = 0;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
        for (int i = 2; value <= maxNumber; i++) {
            value = fibonacciRecursion(i);
            //sum +=value;
            if (value % 2 == 0) {
                answer += value;
            }
            //   System.out.print( + " ");
        }
        System.out.print(answer);
    }

    public static void problem4() {
        int prev = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                if (isPalindrome(i * j)) {
                    if (prev < i * j)
                        prev = i * j;
                    //System.out.println(i+" * "+j+" = "+i*j);
                    break;
                }
            }
        }
        System.out.println(prev);
    }

    public static void problem3() {
        long pre = 0L;
        long number = 600851475143L;
        //long number = 13195L ;
        System.out.println(number);

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                //System.out.println(i+" ");
                number = number / i;
                //System.out.println(number+" ");
                if (pre < i)
                    pre = i;
            }
        }/*
        if(number>pre)
            System.out.println(number);
        else*/
        System.out.println(pre);
    }

    public static void problem5() {
        int i = 0;
        while (true) {
            int flag = 0;
            i += 10;
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void problem6() {
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sumOfSquares += i * i;
            sum += i;
        }
        System.out.println((sum * sum) - sumOfSquares);
    }
}
