package com.star;

import java.util.Scanner;
/*

     *
    **
   ***
  ****
 *****

 */
public class star_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter line number ::");
        int l=s.nextInt();
        for (int i=0;i<l;i++){
            for (int j=0;j<l;j++){
               if ((i+j+2)>l) {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
            }
            System.out.println("");
        }
    }
}
