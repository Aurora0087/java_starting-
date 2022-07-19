package com.rev_array;

import java.util.Scanner;

public class rev_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter array's size :: ");
        int n=s.nextInt();
        float[] num=new float[n];
        float hold;
        System.out.println("Enter array's value ::");
        for (int i=0;i<n;i++){
            System.out.print((i+1)+" NUMBER = ");
            num[i]=s.nextFloat();
        }
        System.out.println("\nGiven array is given below ::");
        for (float ele:num){
            System.out.print(ele+"\t");
        }
        for (int i=0;i<(n/2);i++){
            hold=num[i];
            num[i]=num[n-1-i];
            num[n-i-1]=hold;
        }
        System.out.println("\nRevers array is given below ::");
        for (float ele:num){
            System.out.print(ele+"\t");
        }
    }
}
