package com.day;

import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        System.out.println("Enter number of day in week ::");
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        if (d<1||d>7){
            System.out.println("Please enter the correct day.");
        }
        else {
            if (d==1){
                System.out.println("It's SUNDAY.");
            }
            else if (d==2) {
                System.out.println("It's MONDAY.");
            }
            else if (d==3) {
                System.out.println("It's TUESDAY.");
            }
            else if (d==4) {
                System.out.println("It's WEDNESDAY.");
            }
            else if (d==5) {
                System.out.println("It's THURSDAY.");
            }
            else if (d==6) {
                System.out.println("It's FRIDAY.");
            }
            else{
                System.out.println("It's SATURDAY.");
            }
        }
    }
}
