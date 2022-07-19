package com.oop.Constructors;

import java.util.Scanner;

class stu{
    private int id;
    private String name;
    private int yr;
    public stu(int i,String nam,int y){
//        id=01;
//        name="ZERO ONE";
//        yr=2;
        id=i;
        name=nam;
        yr=y;
    }
    public int stu_getId(){
        return id;
    }
    public String stu_get_name(){
        return name;
    }
    public int get_year(){
        return yr;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter student's name :: ");
        String nm=s.nextLine();
        System.out.print("Enter student's id :: ");
        int id=s.nextInt();
        System.out.print("Enter student's studying year:: ");
        int y=s.nextInt();
        stu a=new stu(id,nm,y);
        System.out.println("\nStudent's name = "+a.stu_get_name());
        System.out.println("Student's id = "+a.stu_getId());
        System.out.println("Student's study year = "+a.get_year());
    }
}
