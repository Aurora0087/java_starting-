package ds.ex1.stack;

import java.util.Scanner;

class stacks{
    double[] data=new double[100];
    int top=-1;
    public void push(double data){
        if (this.top==99){
            System.out.println("\nStack is full, can't insert element in this stack.");
            return;
        }
        top++;
        this.data[top]=data;
    }
    public void pop(){
        if (this.top< -1) {
            System.out.println("\nStack is empty.");
            return;
        }
        this.top--;
    }
    public void display(){
        if (this.top< -1) {
            System.out.println("\nStack is empty.");
            return;
        }
        System.out.println("\n:: Elements given below ::");
        for (int i=0;i<=top;i++){
            System.out.print(this.data[i]+" | ");
        }
    }
}

public class stack {
    public static void main(String[] args) {
        System.out.println("\n:: Stack ::");
        Scanner s=new Scanner(System.in);
        double data;
        System.out.print("\nEnter how many element you want to insert in Stack = ");
        int size=s.nextInt();
        stacks a=new stacks();
        for (int i=0;i<size;i++){
            System.out.print("\nElement number "+(i+1)+" = ");
            data=s.nextDouble();
            a.push(data);
        }
        a.display();
        System.out.print("\n:: Enter which element you want ti insert in stack ::\n");
        data=s.nextDouble();
        a.push(data);
        a.display();
        System.out.print("\n:: Deleting last element from stack ::\n");
        a.pop();
        a.display();
    }
}
