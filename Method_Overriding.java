package com.oop.Method_Overriding;

import java.util.Scanner;

class box1{
    public int roll;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

}
class box2 extends box1{
    @Override
    public int getRoll() {
        return roll*roll;
    }
    private String nm;
    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        System.out.println("\tMethod Overriding ::");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter roll number ::");
        int roll=s.nextInt();
        box1 a1=new box1();
        box2 a2=new box2();
        a2.setRoll(roll);
        a1.setRoll(roll);
        System.out.println("IN class box1 = "+a1.getRoll());
        System.out.println("IN class box2 = "+a2.getRoll());
    }
}
