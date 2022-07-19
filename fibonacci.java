package com.fibonacci;

import java.util.Scanner;

public class fibonacci {
    static int fib(int n){
        if (n==1)return 0;
        else if (n==2) return 1;
        else return fib(n-1)+ fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println("\tFibonacci series ");
        Scanner s=new Scanner(System.in);
        int res=0;
        System.out.println("Enter how many number of fibonacci series you want to see ::");
        int n=s.nextInt();
        for (int i=1;i<=n;i++) {
            System.out.print(fib(i)+"\t");
        }
    }
}
