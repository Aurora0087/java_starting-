package com;

import java.util.Scanner;

public class ascii {
    public static int find_ascii(char c){
        return c;
    }
    public static void main(String[] args) {
        System.out.println(":: ASCII value of a character ::");
        Scanner s=new Scanner(System.in);
        System.out.print("\nEnter a character = ");
        char c=s.next().charAt(0);
        System.out.println("\nASCII value of character "+(c)+" = "+find_ascii(c));
    }
}
