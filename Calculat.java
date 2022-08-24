package com;
import java.util.*;

class Calculator{
    private float num1;
    private float num2;
    public void insert(float num1,float num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void cal(char op){
        if (op!='+'&&op!='-'&&op!='/'&&op!='*') {
            System.out.println("\nWrong instruction given.");
            return;
        }
        switch (op) {
            case '+' -> System.out.print("[ "+num1+" + "+num2+" = "+(num1 + num2)+" ]");
            case '-' -> System.out.print("[ "+num1+" - "+num2+" = "+(num1 - num2)+" ]");
            case '*' -> System.out.print("[ "+num1+" x "+num2+" = "+(num1 * num2)+" ]");
            case '/' -> {
                if(num1!=0)System.out.print("[ "+num1+" / "+num2+" = "+(num1 / num2)+" ]");
                else System.out.println("\nFast given number is zero, division not possible..");
            }
        }
    }
}

public class Calculat {
    public static void main(String[] args) {
        System.out.println("\n:: Calculator ::\n");
        float num1,num2;
        char op;
        Calculator a1=new Calculator();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter fast number = ");
        num1=s.nextFloat();
        System.out.print("Enter 2nd number = ");
        num2=s.nextFloat();
        a1.insert(num1,num2);
        System.out.println("\n:: Enter What you want to do ::\n'+' : Addition..\n'-' : Subtraction..\n'*' : Multiplication..\n'/' : Division..");
        op=s.next().charAt(0);
        a1.cal(op);
    }
}
