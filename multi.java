package com.multi;

import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Multiplication table of = ");
        int n=s.nextInt();
        System.out.println();
        for (int i=0;i<11;i++){
            System.out.println(i+"\tX\t"+n+"\t= "+(i*n));
        }
    }
}
