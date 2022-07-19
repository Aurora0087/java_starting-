package com.star;

import java.util.Scanner;
/*

*
**
***
****
*****

*/
public class star_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter line number ::");
        int l=s.nextInt();
        for (int i=0;i<l;i++){
            for (int j=0;j<i;j++){
            System.out.print("*");}
            System.out.println("");
        }
    }
}
