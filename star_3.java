package com.star;

import java.util.Scanner;
/*

     *
    ***
   *****
  *******
 *********

 */
public class star_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter line number ::");
        int l=s.nextInt();
        for (int i=0;i<l;i++){
            for (int j=0;j<(2*l-1);j++){
                if(j>=(l-i-1)&&j<=(l+i-1)){
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
