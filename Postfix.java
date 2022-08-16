package ds.ex1.Postfix;

import java.util.Scanner;

class node{
    node pre;
    char data;
    int power;
    node next;
    public node(char data,int power){
        this.pre=null;
        this.data=data;
        this.power=power;
        this.next=null;
    }
}

class stk{
    static node head=null;
    static node tail=null;
    public static void insert(char data,int power){
        node new_node=new node(data,power);
        if (head==null){
            head=new_node;
        }
        else {
            new_node.pre=tail;
            tail.next=new_node;
        }
        tail=new_node;
    }
    public static void pop(){
        if (head==null){
            System.out.println("\nNo element in stack;");
            return;
        } else if (head.next==null) {
            head=null;
            return;
        }
        node dis=head;
        while (dis.next.next!=null){
            dis=dis.next;
        }
        dis.next.pre=null;
        dis.next= null;
        tail=dis;
    }
    public void in_post(String str){
        for (int i=0;i < str.length();i++){
            if (str.charAt(i)=='+'||str.charAt(i)=='-'){
                System.out.print(" ");
                if (tail==null){
                    insert(str.charAt(i),1);
                }
                else if (tail.power>=1){
                    System.out.print(tail.data+" ");
                    pop();
                    insert(str.charAt(i),1);
                }
            }
            else if (str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='%'){
                System.out.print(" ");
                insert(str.charAt(i),2);
            }
            else System.out.print(str.charAt(i));
        }
        node dis=tail;
        if (dis!=null){
            while (dis!=null){
                System.out.print(" "+dis.data);
                if (dis.pre==null){
                    dis=null;
                    continue;
                }
                dis=dis.pre;
            }
        }
    }
}

public class Postfix {
    public static void main(String[] args) {
        System.out.println("\n:: Postfix ::");
        stk a1=new stk();
        String str;
        Scanner s=new Scanner(System.in);
        System.out.print("\nEnter in infix = ");
        str=s.nextLine();
        System.out.print("\n:: postfix of ("+str+") = ( ");
        a1.in_post(str);
        System.out.print(" ) ::");
    }
}
