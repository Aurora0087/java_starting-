package ds.ex1.tree_str;

import java.util.*;

class trees{
    private static class node{
        node left;
        double data;
        node right;
        public node(double data){
            left=null;
            this.data=data;
            right=null;
        }
    }
    public node root;
    public trees(){
        root = null;
    }

    public void put(double data){
        node nt=new node(data);
        if(root==null){
            root=nt;
        }
        else {
            Queue<node> qu= new LinkedList<node>();
            qu.add(root);
            while (true){
                node nod=qu.remove();
                if (nod.left != null && nod.right != null){
                    qu.add(nod.left);
                    qu.add(nod.right);
                }
                else {
                    if (nod.left==null){
                        nod.left=nt;
                        qu.add(nod.left);
                    }
                    else {
                        nod.right=nt;
                        qu.add(nod.right);
                    }
                    break;
                }
            }
        }
    }
     private void inorderTra(node nd){
        if (root==null){
            System.out.println("Tree is empty...");
            return;
        }
        if (nd.left!=null) inorderTra(nd.left);
        System.out.print(nd.data+" | ");
        if (nd.right!=null) inorderTra(nd.right);
    }
    public void print_tree(trees tr){
        tr.inorderTra(tr.root);
    }
    public boolean isBTS(node nd){
        if (nd == null)return true;
        if (nd.left!=null && nd.left.data>=nd.data)return false;
        if (nd.right!=null && nd.right.data<=nd.data)return false;
        return isBTS(nd.left) && isBTS(nd.right);
    }
    public node b_search(node nd,double element){
        while (nd!=null) {
            if (element == nd.data) return nd;
            else if (element < nd.data) return b_search(nd.left, element);
            else return b_search(nd.right, element);
        }
        return null;
    }
}

public class b_tree {
    public static void main(String[] args) {
        trees tr=new trees();
        Scanner s=new Scanner(System.in);
        double data;
        System.out.println("\n:: Enter how many element you want to insert in tree ::");
        int size=s.nextInt();
        for (int i=0;i<size;i++){
            System.out.print("Enter element number "+(i+1)+" = ");
            data=s.nextDouble();
            tr.put(data);
        }
        System.out.println("\n:: Trees elements given below ::\n");
        System.out.println("\n:: Using InOrder ::\n");
        tr.print_tree(tr);
        if(tr.isBTS(tr.root)) {
            System.out.println("\nYes, its a binary tree..");
            System.out.print("\n:: Enter which element you want to search :: ");
            double element=s.nextDouble();
            if(tr.b_search(tr.root,element)!=null) System.out.println(element+" is present in tree...");
            else System.out.println("Given element "+element+" is not present in tree...");
        }
        else System.out.println("\nNop, its a binary tree..");
    }
}
