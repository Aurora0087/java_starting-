package ds.ex1.Parenthesis;

import java.util.Scanner;

class stack{
    char data;
    stack next;
    public stack(char data){
        this.data=data;
        next=null;
    }
}
class nod{
    private static stack head=null;
    private static stack tail=null;
    public void push(char data){
        stack new_stack=new stack(data);
        if (head==null)head=new_stack;
        else{
            tail.next=new_stack;
        }
        tail=new_stack;
    }
    public void pop(){
        if(head.next==null){
            head=null;
            return;
        }
        stack dis=head;
        while (dis.next.next!=null){
            dis=dis.next;
        }
        dis.next= null;
    }
    public boolean checking(String str){
        for (int i=0;i < str.length();i++){
            if(str.charAt(i)=='(') push('(');
            else if (str.charAt(i)==')'){
                if (head==null)return false;
                else pop();
            }
        }
        return head == null;
    }
}

public class Parenthesis_link_list {
    public static void main(String[] args) {
        System.out.println("\n:: Parenthesis Checking Using Stack ::");
        Scanner s=new Scanner(System.in);
        String str;
        nod a1=new nod();
        System.out.print("\nEnter = ");
        str=s.nextLine();
        if (!a1.checking(str)){
            System.out.println("\n:: Parenthesis Checking completed, your given formed is wrong ::");
        }
        else System.out.println("\n:: Parenthesis Checking completed ::");
    }
}
