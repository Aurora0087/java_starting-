package com.factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Factorial of number = ");
        int n=s.nextInt();
        int f=1;
        if (n<0) System.out.println("Please enter correct number.");
        else if (n==0) {
            System.out.println("Factorial of "+n+" = "+f);
        }
        else {
            for (int i=n;i>0;i--){
                f*=i;
            }
            System.out.println("Factorial of "+n+"! = "+f);
        }
    }
}
