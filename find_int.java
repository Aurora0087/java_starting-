package com.find_int;

import java.util.Scanner;

public class find_int {
    static boolean find_num(float[] num,float find){
        boolean a=false;
        for (float element:num){
            if (element == find) {
                a = true;
                break;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float[] number=new float[5];
        System.out.println("Enter arrays value ::");
        for (int i=0;i<5;i++){
            System.out.print("number "+(i+1)+"\t= ");
            number[i]=s.nextFloat();
        }
        System.out.print("Enter which number you want to find in array :: ");
        float find=s.nextFloat();
        if (find_num(number, find)){
            System.out.println("\nYes, "+find+" available in given array.");
        }
        else {
            System.out.println("\nNo, "+find+" not available in given array.");
        }
    }
}
