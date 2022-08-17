package ds.ex1.Queue_Ds.queue_array;

import java.util.Scanner;

class queue_n{
    private int size;
    private int head=-1;
    private int tail=-1;
    private int[] data;
    public queue_n(int size){
        this.size=size;
        this.data=new int[size];
    }
    public void insert(int data){
        if (tail==this.size-1){
            System.out.println("\nQueue is full.");
            return;
        }
        tail++;
        this.data[tail]=data;
    }
    public void display(){
        if (this.tail==this.head){
            System.out.println("\n*Queue is empty.");
            return;
        }
        System.out.println("\n:: Displaying queue's elements ::");
        for (int i=this.head+1;i<=tail;i++){
            System.out.print(this.data[i]+" | ");
        }
    }
    public void delete(){
        if (this.tail==this.head){
            System.out.println("\n*Queue is empty.");
            return;
        }
        head++;
        System.out.println("\n:: Element success-fully deleted ::");
    }
}
public class q_array {
    public static void main(String[] args) {
        System.out.println("\n:: Queue using array ::");
        Scanner s=new Scanner(System.in);
        int data,ch;
        System.out.print("\nEnter size of Queue = ");
        int size=s.nextInt();
        queue_n a1=new queue_n(size);
       do {
           System.out.println("\n:: 1 for Adding element ::\n:: 2 for deleting element ::\n:: 3 for displaying elements ::\n:: 0 or exit for exit ::");
           ch= s.nextInt();
           if (ch==1) {
               System.out.print("\nEnter element = ");
               data = s.nextInt();
               a1.insert(data);
           } else if (ch==2) {
               a1.delete();
           } else if (ch==3) {
               a1.display();
           } else if (ch==0) {
               System.out.println("\nExiting this program.");
           } else System.out.println("\nPlease enter correct input.");
       }while (ch!=0);
    }
}
