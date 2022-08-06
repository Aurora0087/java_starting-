package ds.ex1;

import java.util.Scanner;

class bi_s{
    double[] vl=new double[100];
    int sz=0;
    public void display(){
        if (this.sz<1) {
            System.out.println("\n:: Un-Success, There is no element in array ::");
            return;
        }
        System.out.println();
        for (int i=0;i<=this.sz;i++){
            System.out.print(this.vl[i]+" | ");
        }
        System.out.println("\n:: Success fully printer all array's element ::");
    }
    public void search(double ele){
        int lb=0,hb=this.sz;
        while (lb<hb){
            if(ele==this.vl[(lb+hb)/2]){
                System.out.println(ele+" founded in "+(((lb+hb)/2)+1)+" number index.");
                return;
            }
            else if (ele>this.vl[(lb+hb)/2]){
                lb=((lb+hb)/2)+1;
            }
            else if (ele<this.vl[(lb+hb)/2]) {
                hb=((lb+hb)/2)-1;
            }
        }
        System.out.println("Element is not found in this array.");
    }
}

public class binary_search {
    public static void main(String[] args) {
        System.out.println(":: Binary Search ::");
        bi_s a1=new bi_s();
        Scanner s=new Scanner(System.in);
        System.out.println(":: Enter how many element you want in array [Not more then 100] ::");
        a1.sz=s.nextInt()-1;
        System.out.println("\t:: Enter elements ::");
        for (int i=0;i<=a1.sz;i++){
            System.out.print("Element number "+(i+1)+" = ");
            a1.vl[i]=s.nextDouble();
        }
        a1.display();
        System.out.println(":: Enter which element you want to search in this array ::");
        double ele=s.nextDouble();
        a1.search(ele);
    }
}
