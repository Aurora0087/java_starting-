package com.oop.Inheritance;

import java.util.Scanner;

class cl{
    private int room;
    private int flore;

    public void setFlore(int flore) {
        this.flore = flore;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getRoom() {
        return room;
    }
    public int getFlore() {
        return flore;
    }
}
class st extends cl{
    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        cl k2=new cl();
        st a=new st();
        st b=new st();
        System.out.print("Enter class's room number = ");
        int rom=s.nextInt();
        System.out.print("Enter class's floor number = ");
        int fl=s.nextInt();
        k2.setRoom(rom);
        k2.setFlore(fl);
        System.out.println("\n\tFLOOR = "+k2.getFlore());
        System.out.println("\tROOM = "+k2.getRoom());
        System.out.print("\nEnter fast student room number = ");
        rom=s.nextInt();
        a.setRoom(rom);
        System.out.print("Enter fast student floor number = ");
        fl=s.nextInt();
        s.nextLine();
        a.setFlore(fl);
        System.out.print("Enter student's name = ");
        String nm=s.nextLine();
        a.setName(nm);
        System.out.print("Enter student's id number = ");
        int ii=s.nextInt();
        a.setId(ii);
        System.out.println("\nStudent one's details ::");
        System.out.println("\n\tROOM NUMBER = "+(a.getRoom()));
        System.out.println("\tFLOOR NUMBER = "+(a.getFlore()));
        System.out.println("\tID = "+(a.getId()));
        System.out.println("NAME = "+(a.getName()));
    }
}
