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
        if (this.top<0) {
            System.out.println("\nStack is empty.");
            return;
        }
        this.top--;
    }
    public void display(){
        if (this.top<0) {
            System.out.println("\nStack is empty.");
            return;
        }
        System.out.println("\n:: Elements given below ::");
        for (int i=top;i>=0;i--){
            System.out.print(this.data[i]+" | ");
        }
    }
    public void peek(int index){
        if (index<1||index>(top+1)){
            System.out.println("\nPlease enter valid position.");
            return;
        }
        System.out.println("\nValue of this position's element = "+data[top-index+1]);
    }
    public boolean isEmpty(){
        return this.top < 0;
    }
    public boolean isFull(){
        return this.top >= 99;
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
        if(!a.isEmpty()){
            System.out.println("\nStack is not empty.");
        }
        else {
            System.out.println("\nStack is empty.");
        }
        for (int i=0;i<size;i++){
            System.out.print("\nElement number "+(i+1)+" = ");
            data=s.nextDouble();
            a.push(data);
        }
        a.display();
        System.out.print("\n:: Enter which element you want to insert in stack ::\n");
        data=s.nextDouble();
        a.push(data);
        a.display();
        System.out.print("\n:: Deleting last element from stack ::\n");
        a.pop();
        a.display();
        if(!a.isEmpty()){
            System.out.println("\nStack is not empty.");
        }
        if (!a.isFull()){
            System.out.println("\nStack is not full.");
        }
        System.out.println("\nEnter position where you want to peek.");
        int index=s.nextInt();
        a.peek(index);
    }
}
