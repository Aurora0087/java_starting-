package ds.ex1.link_list;

import java.util.Objects;
import java.util.Scanner;

class node {
    int value;
    node p;
    public node(int value) {
        this.value = value;
        this.p = null;
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
        if (dis==null){
            System.out.println("\nList is empty.");
            return;
        }
        System.out.println("\n:: List is given below ::");
        while (dis!=null){
            System.out.print(dis.value+" | ");
            dis=dis.p;
        }
    }
    public static int insert(int data,int index){
        node dis=head;
        int size=0;
        if (dis==null){
            System.out.println("\n:: List is empty ::");
            return 0;
        } else if (index==1) {
            node new_node=new node(data);
            new_node.p=head;
            head=new_node;
            return ++size;
        }
        for (int i=0;i<index-2;i++){
            dis=dis.p;
        }
        node new_node=new node(data);
        new_node.p=dis.p;
        dis.p=new_node;
        return ++size;
    }

    public static int delete(int index){
        int size=0;
        node dis=head;
        for (int i=0;i<index-2;i++){
            dis=dis.p;
        }
        dis.p=dis.p.p;
        return ++size;
    }

    public static void main(String[] args) {
        int data;
        String ex;
        Scanner s=new Scanner(System.in);
        System.out.println("\n\t:: link list ::");
        System.out.println(":: How many element you want to print in this link list ::");
        int size=s.nextInt();
        for (int i=0;i<size;i++){
            System.out.print("*Enter element number "+(i+1)+" = ");
            data=s.nextInt();
            insert(data);
        }
        display();
        System.out.println("\n:: Enter which element you want to add in list ::");
        data=s.nextInt();
        System.out.println("\n:: Which index you want to add this element ::");
        int index=s.nextInt();
        if (index<1 ||index>size+1){
            System.out.println("\n:: Not capable of storing this element in this index ::");
        }
        else {
        size+=insert(data,index);
        display();
        }
        System.out.println("\n:: Which index's element you want to delete from list ::");
        index=s.nextInt();
        if (index<1 ||index>size+1){
            System.out.println("\n:: Not capable of deleting this element in this index ::");
        }
        else {
            size-=delete(index);
            display();
        }
        
    }
}
