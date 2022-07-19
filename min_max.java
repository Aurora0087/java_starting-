package com.min_max;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int n=s.nextInt();
        float[] num=new float[n];
        System.out.println("Enter array's value in below ::");
        for (int i=0;i<n;i++){
            System.out.print((i+1)+" NUMBER =\t");
            num[i]=s.nextFloat();
        }
        System.out.println("\nGiven array given below ::");
        for (float ele:num){
            System.out.print(ele+"\t");
        }
        float c=0;
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j<num.length-i-1;j++){
                if (num[j]>num[j+1]){
                    c=num[j+1];
                    num[j+1]=num[j];
                    num[j]=c;
                }
            }
        }
        System.out.println("\n\nAfter shorting the given array ::");
        for (float ele:num){
            System.out.print(ele+"\t");
        }
    }
}
