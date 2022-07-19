package com.oop;

import java.util.Scanner;

class square_dit{
    float side;
   static float area(float side){
       return side*side;
   }
   static float perimeter(float side){
       return 4*side;
   }
}

public class squar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        square_dit a=new square_dit();
        System.out.print("Enter square's one sides value :: ");
        a.side=s.nextFloat();
        System.out.println("\nArea of this square is "+square_dit.area(a.side));
        System.out.println("Perimeter of this square is "+square_dit.perimeter(a.side));
    }
}
