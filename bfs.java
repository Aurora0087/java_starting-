package ds.ex1.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class bfs {
    private int vr;
    private LinkedList<Integer> adj[];

    bfs(int v){
        vr=v;
        adj=new LinkedList[vr];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
    }
    void InsertEdge(int v,int w){
        adj[v].add(w);
    }
    void BFStv(int s){
        boolean visit[]=new boolean[vr];
        LinkedList<Integer> que=new LinkedList<>();
        visit[s]=true;
        que.add(s);
        while (que.size()!=0){
            s=que.poll();
            System.out.print(s+" | ");
            Iterator<Integer> j=adj[s].listIterator();
            while (j.hasNext()){
                int num=j.next();
                if(!visit[num]){
                    visit[num]=true;
                    que.add(num);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs a=new bfs(10);
        a.InsertEdge(0,1);
        a.InsertEdge(0,2);
        a.InsertEdge(0,3);
        a.InsertEdge(1,3);
        a.InsertEdge(2,4);
        a.InsertEdge(3,5);
        a.InsertEdge(3,6);
        a.InsertEdge(4,7);
        a.InsertEdge(4,5);
        a.InsertEdge(5,2);
        a.InsertEdge(6,5);
        a.InsertEdge(7,5);
        a.InsertEdge(7,8);
        a.InsertEdge(7,0);
        System.out.println("B.F.S.");
        a.BFStv(2);
    }
}
