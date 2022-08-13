package ds.ex1.stack_link_list;

import java.util.Scanner;

class node{
    node pre;
    double data;
    node next;
    public node(double data){
        pre=null;
        this.data=data;
        next=null;
    }
}

public class stack_using_link_list {
    public static node head=null;
    public static node tail=null;
    public static int push(double data){
        node new_node=new node(data);
        if (head==null)head=new_node;
        else {
            tail.next=new_node;
            new_node.pre = tail;
        }
        tail=new_node;
        return 1;
    }
    public static int pop(){
        if (head==null){
            System.out.println("\nEmpty stack.");
            return 0;
        }
        tail=tail.pre;
        tail.next=null;
        return 1;
    }
    public static void display(){
        if (head==null){
            System.out.println("\nStack is empty.");
            return;
        }
        System.out.println("\n:: Stack's element given below ::");
        node current=tail;
        while (current!=null){
            System.out.print(current.data+" | ");
            current=current.pre;
        }
    }
    public static void main(String[] args) {
        System.out.println("\n:: Implement Stack Using Linked List ::");
        Scanner s=new Scanner(System.in);
        double data;
        System.out.print("Enter how many element you want to insert in stack = ");
        int size=s.nextInt();
        for (int i=0;i<size;i++){
            System.out.print("\nElement number "+(i+1)+" = ");
            data=s.nextDouble();
            push(data);
        }
        display();
        int instr;
        do {
            System.out.println("\n\t:: 1 of pushing element ::\n\t:: 2 of deleting last element ::\n\t:: 3 for displaying stack elements ::\n\t:: 4 for stack size ::\n\t:: 0 for exit ::");
            instr=s.nextInt();
            if (instr==1){
                System.out.print("\nEnter element's value =");
                data=s.nextDouble();
                size+=push(data);
            }
            else if (instr==2) {
                size-=pop();
                System.out.println("\nElement delete successfully executed.");
            }
            else if (instr==3) {
                display();
            }
            else if (instr==4){
                System.out.println("Size of stack = "+size);
            }
            else if (instr==0){
                System.out.println("\n:: Exiting the program ::");
            }
            else System.out.println("\nEnter current input.");

        }while (instr!=0);
    }
}
