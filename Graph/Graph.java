import java.util.*;
public class Graph{
    static class Edge{
        int src ,dest;
        Edge(int s , int d){
            src = s;
            dest = d;
        }
    }

    public static void main(String[] args){
        int v =5;
        ArrayList<Edge> adj[]= new ArrayList[v];
        createGraph(adj);
        // DFS(adj ,4, new boolean[v]);
        // System.out.println();
        //  BFS(adj,4);
        AllPath(adj,1,3,new boolean[v]," ");
        // for(int i=0; i<v; i++){
        //     for(Edge e : adj[i]){
        //         System.out.println(e.src+" --> "+e.dest);
        //     }
        // }
    }

    public static void createGraph(ArrayList<Edge>adj[]){ 
        for(int i=0;i<adj.length;i++){
            adj[i] = new ArrayList<>();
        }
        adj[0].add(new Edge(0,1));
        adj[0].add(new Edge(0,2));
        adj[0].add(new Edge(0,4));

        adj[1].add(new Edge(1,0));

        adj[2].add(new Edge(2,0));
        adj[2].add(new Edge(2,3));
        adj[2].add(new Edge(2,4));

        adj[3].add(new Edge(3,2));
        adj[3].add(new Edge(3,4));

        adj[4].add(new Edge(4,0));
        adj[4].add(new Edge(4,2));
        adj[4].add(new Edge(4,3));
        
    }

    public static void  DFS(ArrayList<Edge> adj[] , int s ,boolean[] vis){
        if(vis[s] ==true)return;
        System.out.print( s +" ");
        vis[s] = true;
        for(Edge e : adj[s]){
            if(vis[e.dest]== false){
                DFS(adj, e.dest, vis);
            }
        }
    }

    public static void BFS(ArrayList<Edge> adj[], int s){
        Queue<Integer> q = new LinkedList<>();
        boolean [] vis = new boolean[adj.length];
       
       q.add(s);
       vis[s] = true;
       while(!q.isEmpty()){
        int v = q.remove();
        System.out.print(v + " ");

        for(Edge e : adj[v]){
            if(!vis[e.dest]){
                q.add(e.dest);
                vis[e.dest] = true;
            }
        }
       }
    }

    public static void AllPath(ArrayList<Edge>adj[], int s , int d , boolean[] vis ,String path){
        if(vis[s])return;
        if(s==d){
            System.out.println(path+d);
            return;
        }
        vis[s] = true;
        path +=s;
        for(Edge e : adj[s]){
            if(!vis[e.dest]){
                AllPath(adj, e.dest, d, vis, path);
            }
        }
        vis[s] = false;
    }
}