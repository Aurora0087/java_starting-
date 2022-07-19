package com.oop;

import java.util.Locale;
import java.util.Scanner;

class employ{
    float salary;
    String name;
    int id;
    static String get_name(String name){
        return name.toUpperCase(Locale.ROOT);
    }
}

public class emp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        employ a = new employ();
        System.out.println("Enter employ's name :");
        a.name=s.nextLine();
        System.out.println("Enter employ's id :");
        a.id=s.nextInt();
        System.out.println("Enter employ's salary :");
        a.salary=s.nextFloat();
        System.out.println("Employ's name is "+ employ.get_name(a.name));
    }
}
