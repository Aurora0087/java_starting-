package com.oop;

class cellphone{
    int n;
    static void r(){
        System.out.println("RINGING.......");
    }
    static void v(){
        System.out.println("VIBRATING.......");
    }
}

public class mobil {
    public static void main(String[] args) {
        cellphone.r();
        cellphone.v();
        System.out.println();
        for (int i=0;i<5;i++){
            cellphone.v();
        }
    }
}
