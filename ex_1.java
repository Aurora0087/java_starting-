package com.ex_1;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        System.out.println("Here you can Gonna find your percentage of your last exam's[OUT OF 600] ::");
        float e,m,h,g,s,c,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("TOTAL MARKS OBTAIN IN SUB.1 ::");
        e=sc.nextFloat();
        System.out.println("TOTAL MARKS OBTAIN IN SUB.2 ::");
        m=sc.nextFloat();
        System.out.println("TOTAL MARKS  OBTAIN IN SUB.3 ::");
        h=sc.nextFloat();
        System.out.println("TOTAL MARKS OBTAIN IN SUB.4 ::");
        g=sc.nextFloat();
        System.out.println("TOTAL MARKS OBTAIN IN SUB.5 ::");
        s=sc.nextFloat();
        System.out.println("TOTAL MARKS OBTAIN IN SUB.6 ::");
        c=sc.nextFloat();
        if (e < 0 || e > 100 || m < 0 || m > 100 || h < 0 || h > 100 || g < 0 || g > 100 || s < 0 || s > 100 || c < 0 || c > 100){
            System.out.println("You entered wrong marks PLEASE ENTER MARKS FOR EACH SUB BETWEEN 0 TO 100.");
        }
        else {
            res=((e+m+h+g+s+c)*100)/600;
            System.out.println("Total marks is :"+(e+m+h+g+s+c));
            System.out.println("Total marks percentage is :"+res);
        }
    }
}
