package com.oop;

class game{
    static void hit(){
        System.out.println("Hitting.....");
    }
    static void  run(){
        System.out.println("Running......");
    }
    static  void fir(){
        System.out.println("firring......");
    }
    static  void walking(){
        System.out.println("Walking.......");
    }
}

public class tommy_game {
    public static void main(String[] args) {
        game.fir();
        game.hit();
        game.run();
        game.walking();
    }
}
