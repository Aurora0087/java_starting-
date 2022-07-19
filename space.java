package com.space;

import java.util.Scanner;

public class space {
    public static void main(String[] args) {
        System.out.println("Enter a line ::");
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        System.out.println(st.replace(" ","_"));
    }
}
