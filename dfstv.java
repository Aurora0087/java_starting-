package ds.ex1.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class dfstv {
    private int vr;
    private LinkedList<Integer> adj[];

    dfstv(int v){
        vr=v;
        adj=new LinkedList[vr];
        for (int i=0; i<v; i++)
            adj[i] = new LinkedList<>();
    }
    void InsertEdge(int v,int w){
        adj[v].add(w);
    }
    void DFSUtil (int s,boolean visit[]){
        visit[s]=true;
        System.out.print(s+" | ");
        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visit[n])
                DFSUtil(n, visit);
        }
    }
    void dfs(int s){
        boolean visit[]=new boolean[vr];
        DFSUtil(s, visit);
    }
    public static void main(String[] args) {
        dfstv a=new dfstv(9);
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
        System.out.println("D.S.F.");
        a.dfs(2);
    }
}
