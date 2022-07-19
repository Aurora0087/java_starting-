package com.oop;

import java.io.IOException;
import java.util.Scanner;

class rectangle{
    float h;
    float w;
    static float area(float w,float h){
        return w*h;
    }
    static float perimeter(float w,float h){
        return 2*(w+h);
    }
}

public class rtg {
    public static void main(String[] args){
        rectangle a=new rectangle();
        Scanner s=new Scanner(System.in);
        System.out.print("Rectangle's height = ");
        a.h=s.nextFloat();
        System.out.print("Rectangle's width = ");
        a.w=s.nextFloat();
        System.out.println("\nArea of this rectangle = "+rectangle.area(a.w,a.h));
        System.out.println("Perimeter of this rectangle = "+rectangle.perimeter(a.w,a.h));
    }
}
