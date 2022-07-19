package com.image;

import java.util.Scanner;

public class image {
    public static double prob(int[] a,int n,int m) {
        double res = 0.0;
        if (n != m) {
            double max_r = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++)
                res += a[i];
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    double b = res - (a[i] + a[j]);
                    double x = (a[i] + a[j]) / 2.0;
                    if ((b + x) > max_r)
                        max_r = b + x;
                }
            }
            return max_r;
        } else {
            for (int i = 0; i < n; i++)
                res += a[i];
            return res;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        long tc=s.nextLong();
        for(int t=1;t<=tc;t++){
            int n=s.nextInt();
            int m=s.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            System.out.println("Case #"+t+": "+prob(a,n,m));
        }
    }
}
