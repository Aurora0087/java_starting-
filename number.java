package com;

import java.util.Scanner;

public class number {
    public static void check_num(double a,double b){
        if (a==b) System.out.println("\nBoth numbers are same.");
        else if (a>b) System.out.println("\n1st given number "+(a-b)+" time bigger then 2nd given number.");
        else System.out.println("\n2nd given number "+(b-a)+" time bigger then 1st given number.");
    }
    public static void main(String[] args) {
        double a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("\nEnter 1st number = ");
        a=s.nextDouble();
        System.out.print("\nEnter 2nd number = ");
        b=s.nextDouble();
        check_num(a,b);
    }
}
