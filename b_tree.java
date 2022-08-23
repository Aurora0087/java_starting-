package ds.ex1.tree_str;

import java.util.*;

class trees{
    public static class node{
        node left;
        int data;
        node right;
        public node(int data){
            left=null;
            this.data=data;
            right=null;
        }
    }
    public node root;
    public trees(){
        root = null;
    }

    public void put(int data){
        node nt=new node(data);
        if(root==null){
            root=nt;
            return;
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
    public void inorderTra(node nd){
        if (root==null){
            System.out.println("Tree is empty...");
            return;
        }
        if (nd.left!=null) inorderTra(nd.left);
        System.out.print(nd.data+" | ");
        if (nd.right!=null) inorderTra(nd.right);
    }
}

public class b_tree {
    public static void main(String[] args) {
        trees tr=new trees();
        tr.put(1);
        tr.put(2);
        tr.put(3);
        tr.put(4);
        tr.put(5);
        tr.put(6);
        tr.put(7);
        tr.put(8);
        System.out.println("\n:: Trees elements given below ::\n");
        System.out.println("\n:: Using InOrder ::\n");
        tr.inorderTra(tr.root);
    }
}
