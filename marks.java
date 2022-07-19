package com.marks;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float e,m,s,g;
        System.out.println("ENTER ALL SUBJECTS MARKS[OUT OF 100] ::\n");
        System.out.print("English ::");
        e=sc.nextFloat();
        System.out.print("Math ::");
        m=sc.nextFloat();
        System.out.print("Science ::");
        s=sc.nextFloat();
        System.out.print("Geo ::");
        g=sc.nextFloat();
        if(e>100||e<0||m>100||m<0||s>100||s<0||g>100||g<0){
            System.out.println("\nPlease enter the correct marks you got in exam.");
        }
        else {
            float total=e+m+s+g;
            if (total/4<40||e<33||m<33||s<33||g<33){
                System.out.println("\nYou total got "+total+" out of 400.\nYou are failed this exam.");
            }
            else {
                System.out.println("\nYou total got "+total+" out of 400.\nYou are passed this exam.");
            }
        }
    }
}
