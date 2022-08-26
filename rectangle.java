package com;

import java.util.Scanner;

class rec{
    private double w,h;
    public rec(double w,double h){
        this.w=w;
        this.h=h;
    }
    public double area(){
        return w*h;
    }
}

public class rectangle {
    public static void main(String[] args) {
        double w,h;
        Scanner s=new Scanner(System.in);
        do {
            System.out.print("\nWidth of the rectangle = ");
            w=s.nextDouble();
            System.out.print("\nHeight of the rectangle = ");
             h=s.nextDouble();
             if (w<0||h<0) System.out.println("\n:: Please give positive value ::");
        }while (w<0||h<0);
        rec a1=new rec(w,h);
        System.out.println("\nArea of the given rectangle = "+a1.area());
    }
}
