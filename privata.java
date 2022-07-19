package com.oop.privata;

import java.util.Scanner;

class emp{
    // private variable in class we are not able to change its value from outside the that class
    private int id;
    private String name;
    public void get_name(String n){

        name=n;
    }
    public String pr_name(){
        return name;
    }
    public void get_id(int i){
        id=i;
    }
    public int pr_id(){

        return id;
    }
}

public class privata {
    public static void main(String[] args) {
        emp a=new emp();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter id number :: ");
        int i=s.nextInt();
        s.nextLine();
        a.get_id(i);
        System.out.print("Enter name :: ");
        String nam=s.nextLine();
        a.get_name(nam);
        System.out.println("\nID = "+a.pr_id());
        System.out.println("NAME= "+a.pr_name());
    }

}
