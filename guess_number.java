package com.Guess_Number;

import java.util.Scanner;

class g_n{
    private int rando,min=0,guss,max,count=1;
    public g_n(int mx){
        //for generating random number from taking maximum rand from the user
        max=mx;
        rando=(int) (Math.random() * (max - min + 1) + min);
    }
    public void get_guess(int g){
        //talking guess from user
        guss=g;
    }
    public boolean is_correct(){
        //checking the guess number
        boolean a=false;
        if (rando>guss){
            System.out.println("\n\tYOU GUESSED LOWER NUMBER.\nPLEASE TRY TO GUESS HIGHER NUMBER.");
            count ++;
        } else if (rando<guss) {
            System.out.println("\n\tYOU GUESSED HIGHER NUMBER.\nPLEASE TRY TO GUESS LOWER NUMBER.");
            count ++;
        }
        else {
            System.out.println("\nCONGRATULATION TO GUESSING THE CORRECT NUMBER.");
           a=true;
        }
        return a;
    }
    public int get_count(){return count;}
    public int get_rando(){return rando;}
}

public class guess_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean a;
        int mx=0;
        System.out.println("\tNow we are going to play number guessing game.\nWhere range is 0 to whatever you want[HIGHER THEN 10].");
        do {
            System.out.print("\t\tEnter the range :: ");
            mx = s.nextInt();
            if (mx < 10) {
                System.out.println("\tMinimum range need to be between  0 - 10.\nPlease try to enter number higher-then 9.");
            } else {
                g_n num = new g_n(mx);
                do {
                    System.out.println("*****************************************************");
                    System.out.print("\tGuess the number :: ");
                    int gs = s.nextInt();
                    num.get_guess(gs);
                    a = num.is_correct();
                } while (!a);
                System.out.println("\tYou correctly guess number in " + num.get_count() + " turns.");
            }
        }while (mx<10);
    }
}
