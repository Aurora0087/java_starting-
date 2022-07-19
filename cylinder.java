package com.oop.cylinder;

import java.util.Scanner;

class my_cylinder{
    private double Radius,Height;
    public my_cylinder(double r,double h){
        Radius=r;
        Height=h;
    }
    public double get_area(){
        return ((2*3.141*Radius*Height)+(2*3.141*Radius*Radius));
    }
    public  double get_perimeter(){
        return ((4*Radius)+(2*Height));
    }
    public  double get_volume(){
        return (3.141*Radius*Radius*Height);
    }
}

public class cylinder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter cylinder's details ::");
        System.out.print("\tRadius = ");
        double r=s.nextFloat();
        System.out.print("\tHeight = ");
        double h=s.nextFloat();
        my_cylinder a=new my_cylinder(r,h);
        System.out.println("\nArea of Perimeter\t= "+a.get_perimeter());
        System.out.println("Volume of Cylinder\t= "+a.get_volume());
        System.out.println("Area of Cylinder\t= "+a.get_area());
    }
}
