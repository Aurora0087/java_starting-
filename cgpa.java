package com.cgpa;

import java.util.Scanner;// its not done yet

public class cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float m,cp,c,tc;
        cp=tc=0;
        System.out.println("About 1st sub ::");
        System.out.println("Obtain Marks in sub ::");
        m=sc.nextFloat();
        if(m>=90 && m<=100){
            m=10;
        }
        else if (m>=80 && m<=89) {
            m=9;
        }
        else if (m>=70 && m<=79) {
            m=8;
        }
        else if (m>=60 && m<=69) {
            m=7;
        }
        else if (m>=50 && m<=59) {
            m=6;
        }
        else if (m>=40 && m<=49) {
            m=5;
        }
        else if (m<=40) {
            m=2;
        }
        System.out.println("Credit of sub ::");
        c=sc.nextFloat();
        tc+=c;
        cp+=(m*tc);
        System.out.println("Credit point is::"+(cp));
        }
    }
