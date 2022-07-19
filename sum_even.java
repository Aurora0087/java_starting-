package com.sum_even;

import java.util.Scanner;

public class sum_even {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Fast n even numbers sum::");
        System.out.print("n = ");
        int n=s.nextInt();
        int sum=0;
        if (n<0){
            System.out.println("You enter wrong input.");
        }
        else {
            for (int i = 0; i < n; i++) {
                sum += (i * 2);
            }
            System.out.println("Sum of fast " + n + " even numbers = " + sum);
        }
    }
}
