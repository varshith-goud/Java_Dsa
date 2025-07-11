package Recurssion;

import java.sql.SQLOutput;

public class easy {
    public static void main(String[] args) {
//  print(5);
//  printrev(5);
        System.out.println(fact(5));
        System.out.println(add(5));
        System.out.println(SumDigits(143));
        System.out.println(productDigits(143));
        System.out.println( revNum(143,0));

        System.out.println(palindrome(141));
    }
    static void print(int n){
        if(n==0){

            return ;
        }
        System.out.println(n);
        print(n-1);

    }
    static void printrev(int n){
        if(n==0){

            return ;
        }

        printrev(n-1);
        System.out.println(n);

    }
    static int fact(int n){
        if(n <= 1 ){
            return 1;
        }
        return n*fact(n-1);

    }
    static int add(int n){
        if(n <= 1 ){
            return 1;
        }
        return n+add(n-1);

    }
    static int SumDigits(int n){
        if(n ==0 ){
            return 0;
        }
        return (n%10)+SumDigits(n/10);

    }
    static int productDigits(int n){
        if(n ==0 ){
            return 1;
        }
        return (n%10)*productDigits(n/10);

    }

    static int revNum(int n,int rev){
        if(n==0){
            return rev ;
        }
        int rem =n%10;

       return revNum(n/10,rev*10+rem);
    }

    static boolean palindrome(int n){
        return n == revNum(n,0);
    }
}

