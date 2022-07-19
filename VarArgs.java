package com.VarArgs;


public class VarArgs {
    static float sum(float... num){
        float res = 0;
        for (float a:num){
            res+=a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Variable Arguments (VarArgs) in Java ::\n");
        System.out.println("Sum of 1,2,3 = "+sum(1,2,3));
        System.out.println("Sum of 1,2,3,4 = "+sum(1,2,3,4));
        System.out.println("Sum of 1,2,3,4,5 = "+sum(1,2,3,4,5));
        System.out.println("Sum of 1,2,3,4,5,6 = "+sum(1,2,3,4,5,6));
        System.out.println("Sum of 1,2,3,4,5,6,7 = "+sum(1,2,3,4,5,6,7));
    }
}
