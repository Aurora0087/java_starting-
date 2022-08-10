package ds.ex1.link_list;

import java.util.Scanner;

class list{
    list pre;
    int data;
    list next;
    public list(int data){
        this.pre=null;
        this.data=data;
        this.next=null;
    }
}

public class Doubly_link_list {
    public static list head = null;
    public static list tail = null;

    public static void insert(int data) {
        list new_node = new list(data);
        if (head == null) {
            head = new_node;
        } else {
            new_node.pre = tail;
            tail.next = new_node;
        }
        tail = new_node;
    }

    public static void display() {
        list dis = head;
        if (dis == null) {
            System.out.println("\nList is empty.");
            return;
        }
        System.out.println("\n:: List is given below ::");
        while (dis != null) {
            System.out.print(dis.data + " | ");
            dis = dis.next;
        }

    }
    public static void back_display() {
        list dis = tail;
        if (dis == null) {
            System.out.println("\nList is empty.");
            return;
        }
        System.out.println("\n:: List in backward order::");
        while (dis != null) {
            System.out.print(dis.data + " | ");
            dis = dis.pre;
        }
    }
    public static int insert(int data,int index){
        list dis=head;
        int size=0;
        if (dis==null){
            System.out.println("\n:: List is empty ::");
            return 0;
        } else if (index==1) {
            list new_node=new list(data);
            new_node.next=head;
            head=new_node;
            return ++size;
        }
        for (int i=0;i<index-2;i++){
            dis=dis.next;
        }
        list new_node=new list(data);
        new_node.next=dis.next;
        new_node.pre=dis;
        dis.next.pre=new_node;
        dis.next=new_node;
        return ++size;
    }
    public static int delete(int index){
        int size=0;
        list dis=head;
        for (int i=0;i<index-2;i++){
            dis=dis.next;
        }
        dis.next=dis.next.next;
        dis.next.pre=dis;
        return ++size;
    }

    public static void main(String[] args) {
        System.out.println("\n:: Doubly link list ::");
        Scanner s=new Scanner(System.in);
        int data;
        System.out.println("\n:: Enter how many element you want to add in link list ::");
        int size=s.nextInt();
        for (int i=0;i<size;i++){
            System.out.print("\n*Element number "+(i+1)+" = ");
            data=s.nextInt();
            insert(data);
        }
        display();
        back_display();
        System.out.println("\n:: Enter value of the element you want to insert in list ::");
        data=s.nextInt();
        System.out.println("\n:: Enter index of that element ::");
        int index=s.nextInt();
        size+=insert(data,index);
        display();
        back_display();
        System.out.println("\n:: Enter index of that element you want to delete ::");
        index=s.nextInt();
        size-=delete(index);
        display();
        back_display();
        System.out.println("\n:: NOW size of the list = "+size);
    }
}
