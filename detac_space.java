package com.detac_space;

import java.util.Scanner;

public class detac_space {
    public static void main(String[] args) {
        System.out.println("Enter a line ::");
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        System.out.println("\n***********************************************");
        if (st.contains("   ")){
            System.out.println("We have triple space in this line.");
        }
        else if (st.contains("  ")){
            System.out.println("We have double space in this line.");
        }
        else{
            System.out.println("No double or triple space founded in this given line.");
        }
        System.out.println("***********************************************\n");
    }
}
