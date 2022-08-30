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
    public double minValue(node r){
        double min=r.data;
        while (r.left!=null){
            min=r.data;
            r=r.left;
        }
        return min;
    }
    public void Insertion(node nd,double element){
        node pre=null;
        while (nd!=null){
            pre=nd;
            if (element==nd.data){
                System.out.println("Element "+element+" already have in BTS...");
                return;
            }
            else if (element < nd.data)nd=nd.left;
            else nd=nd.right;
        }
        node new_node=new node(element);
        assert pre != null;
        if (element<pre.data)pre.left=new_node;
        else pre.right=new_node;
    }
    void deleteKey(double value) { root = deleteTree(root, value); }
    public node deleteTree(node r,double v){
        if (r==null)return null;
        if (v<r.data) r.left=deleteTree(r.left,v);
        else if (v>r.data) {
            r.right=deleteTree(r.right,v);
        }
        else {
            if (r.left==null)return r.right;
            else if (r.right==null) {
                return r.left;
            }
            else{
                r.data=minValue(r.right);
                r.right=deleteTree(r.right,r.data);
            }
        }
        return r;
    }
}

public class b_tree {
    public static void main(String[] args) {
        trees tr=new trees();
        Scanner s=new Scanner(System.in);
        double data,element;
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
            element=s.nextDouble();
            if(tr.b_search(tr.root,element)!=null) System.out.println(element+" is present in tree...");
            else System.out.println("Given element "+element+" is not present in tree...");
        }
        else System.out.println("\nNop, its a binary tree..");
        System.out.print("\nEnter which element you want to insert in tree = ");
        element=s.nextDouble();
        tr.Insertion(tr.root,element);
        System.out.println("\n:: Trees elements given below ::\n");
        tr.print_tree(tr);
        System.out.print("\nEnter which element you want to delete = ");
        element=s.nextDouble();
        tr.deleteKey(element);
        tr.print_tree(tr);
        if(tr.isBTS(tr.root)) System.out.println("\nIt's a bts tree...");
    }
}
