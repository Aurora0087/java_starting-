package com.oop.Constructors;

import java.util.Scanner;

class student{
    private int id;
    private String name;
    private double selary;
    public student(){
        this.name ="NAME IS NOT GIVEN";
        this.selary=10000.00;
    }
    public student(int i,String nm,double sry){
        this.id=i;
        this.name=nm;
        this.selary=sry;
    }
    public void get_dit(){
        System.out.println("Id = "+id+"\nNAME = "+name+"\nSALARY = "+selary);
    }
}

public class overload {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ID = ");
        int i=s.nextInt();
        s.nextLine();
        System.out.print("NAME = ");
        String nm=s.nextLine();
        System.out.print("salary = ");
        double sl=s.nextDouble();
        student a=new student(i,nm,sl);
        student b=new student();
        System.out.println("\nGIVEN DETAILS ::");
        a.get_dit();
        System.out.println("\nDEFAULT DETAILS ::");
        b.get_dit();
    }
}
