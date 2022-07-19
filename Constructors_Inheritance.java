package com.oop.Constructors_Inheritance;

class box1{
    private int box_num;

    public  box1(){
        System.out.println("It's from box1.");
    }

    public  box1(int i){
        System.out.println("It's from box1 overloaded constructor."+i);
    }

    public int getBox_num() {
        return box_num;
    }

    public void setBox_num(int box_num) {
        this.box_num = box_num;
    }
}
class box2 extends box1{
    private double cost;

    public box2(){System.out.println("It's from box2.");}

    public box2(double a,int b){
        super(b);
        System.out.println("It's from box2 overloaded constructor.a = "+a+" b = "+b);}

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
class box3 extends box2{
    String pro;

    public box3(){
        System.out.println("It's from box3.");
    }

    public box3(String nm,double a,int b){
        super(a, b);
        System.out.println("It's from box3 overloaded constructor.product name = "+nm+" value = "+a+" box number = "+b);
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }
}

public class Constructors_Inheritance {
    public static void main(String[] args) {
        System.out.println("\tRUNNING BOX  without giving any value ::");
        box1 a1=new box1();
        System.out.println("\tRUNNING BOX 2 without giving any value ::");
        box2 b1=new box2();
        System.out.println("\tRUNNING BOX 3 without giving any value ::");
        box3 c1=new box3();
        System.out.println("\n:: USING SUPER CASH ::");
        System.out.println("\n\tRUNNING BOX  with giving value ::");
        box1 a2=new box1(23);
        System.out.println("\tRUNNING BOX 2 with giving values ::");
        box2 b2=new box2(4500.23,12);
        System.out.println("\tRUNNING BOX 3 with giving values ::");
        box3 c2=new box3("note book",85.00,7);
    }
}
