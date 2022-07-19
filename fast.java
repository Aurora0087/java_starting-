package com.fast;

import java.util.Scanner;

public class fast {
    public static void main(String[] args) {
        System.out.println("hola boys");
        long a=1458;
        System.out.println(a);
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st number =");
        int b=s.nextInt();
        System.out.println("enter 2nd number =");
        int c=s.nextInt();
        System.out.println("enter 3rd number =");
        int d=s.nextInt();
        System.out.println("1st = "+b);
        System.out.println("2nd = "+c);
        System.out.println("3rd = "+d);
        System.out.println("total = "+(b+c+d));
        System.out.println(b+" hola "+c);
    }
}
