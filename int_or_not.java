package com.int_or_not;

import java.util.Scanner;
import java.lang.String;

public class int_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the line ::");
        String num=s.nextLine();
        System.out.println("Enter which number you wan to find in line ::");
        char c=s.next().charAt(0);
        if(num.indexOf(c)>=0){
            System.out.println("Yes, "+c+" exist in given line.");
        }
        else {
            System.out.println(c+" dose not exist in given line.");
        }
    }
}
