package ds.ex1.link_list;

import java.util.Objects;
import java.util.Scanner;

class node{
    int value;
    node p;
    public node(int value){
        this.value=value;
        this.p=null;
    }
}

public class link_list {
    public static node head = null;
    public static node tail = null;
    public static void insert(int data){
        node new_node=new node(data);
        if(head==null){
            head=new_node;
        }
        else {
            tail.p=new_node;
        }
        tail=new_node;
    }
    public static void display(){
        node dis=head;
        int size=0;
        if (dis==null){
            System.out.println("\nList is empty.");
            return;
        }
        System.out.println("\n:: List is given below ::");
        while (dis!=null){
            System.out.print(dis.value+" | ");
            dis=dis.p;
            size++;
        }
        System.out.println("\nSize of this list = "+size);
    }
    public static void main(String[] args) {
        int data,i=1;
        String ex;
        Scanner s=new Scanner(System.in);
        System.out.println("\n\t:: link list ::");
        do {
            System.out.print("*Enter element number "+(i++)+" = ");
            data=s.nextInt();
            insert(data);
            System.out.print("Want to continue Y/N :: ");
            ex=s.next();
        }while (!Objects.equals(ex, "n") && !Objects.equals(ex, "N"));
        display();
    }
}
