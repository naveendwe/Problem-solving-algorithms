package com.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTest {

    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for ( int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static  void bfs(ArrayList<Edge> graph[], int V ){
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[V];
        queue.add(0);
        while(!queue.isEmpty()){
             int curr = queue.remove();
             if(!visited[curr]) {
                 System.out.print(curr+" ");
                 visited[curr] = true;
                 for( int i = 0;i<graph[curr].size();i++){
                     Edge e = graph[curr].get(i);
                     queue.add(e.dest);
                 }
             }

        }
    }

    // DFS traversal or search algorithms in java
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // print all path
    public static void printAllPaths(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {
        if(curr == tar){
            System.out.println(path+curr);
            return;
        }
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                vis[curr] = true;
                printAllPaths(graph, vis, e.dest, path+e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        boolean vis[] = new boolean[V];
        ArrayList<Edge>[] edges = new ArrayList[V];
        createGraph(edges);
      //  bfs(edges, V);
        dfs(edges, 0, vis);
        System.out.println();
        printAllPaths(edges, new boolean[V], 0, "0", 3);

//        for(int j = 0;j<V;j++) {
//            for (int i = 0; i < edges[j].size(); i++) {
//                Edge edge = edges[j].get(i);
//                System.out.print(edge.src + " , " + edge.dest+" : ");
//            }
//            System.out.println();
//        }

    }
}
