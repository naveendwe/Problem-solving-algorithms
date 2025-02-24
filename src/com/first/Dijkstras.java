package com.first;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras {

       static class Edge{
           int src, dest, wt;
           Edge(int src, int dest, int wt){
               this.src = src;
               this.dest = dest;
               this.wt = wt;
           }
       }
       static void createGraph(ArrayList<Edge> graph[]){
           for(int i=0; i<graph.length; i++){
                 graph[i] = new ArrayList<>();
           }
           graph[0].add(new Edge(0,1,2));
           graph[0].add(new Edge(0,2,4));

           graph[1].add(new Edge(1,3,7));
           graph[1].add(new Edge(1,2,1));

           graph[2].add(new Edge(2,4,3));

           graph[3].add(new Edge(3,5,1));
           graph[4].add(new Edge(4,3,2));
           graph[4].add(new Edge(4,5,5));

       }
       static class Pair implements  Comparable<Pair>{

           int n, path;
           public Pair(int n , int path) {
               this.n = n;
               this.path = path;
           }
           @Override
           public int compareTo(Pair p2) {
               return this.path - p2.path;
           }
       }

       public static int[] dijkstraj(ArrayList<Edge> graph[], int src){
           PriorityQueue<Pair> pq = new PriorityQueue<>();
           int dist[] = new int[graph.length];
           boolean vis[] = new boolean[graph.length];

           for(int i = 0; i < graph.length; i++){
               if(i != src){
                   dist[i] = Integer.MAX_VALUE;
               }
           }

           pq.add(new Pair(src, 0));
           while(!pq.isEmpty()){
               Pair curr = pq.remove();
               if(!vis[curr.n]){
                   vis[curr.n] = true;
                   for(int i = 0;i<graph[curr.n].size();i++){
                       Edge edge = graph[curr.n].get(i);
                       int u = edge.src;
                       int V = edge.dest;
                       if(!vis[V] && dist[u]+edge.wt< dist[V]){
                          dist[V] = dist[u]+edge.wt;
                          pq.add(new Pair(V, dist[V]));
                       }
                   }
               }
           }
           return dist;
       }

       //Bellman ford algorithm
       public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
           int dest[] = new int[V];
           for (int i = 0; i < V; i++) {
               if (i != src) {
                   dest[i] = Integer.MAX_VALUE;
               }
           }

           for (int k = 0; k < V - 1; k++) {
               for (int i = 0; i < V; i++) {
                   for (int j = 0; j < graph[i].size(); j++) {
                       Edge edge = graph[i].get(j);
                       int u = edge.src;
                       int v = edge.dest;
                       int weight = edge.wt;
                       if (dest[u] != Integer.MAX_VALUE && dest[u] + edge.wt < dest[v]) {
                           dest[v] = dest[u] + edge.wt;
                       }
                   }
               }
               for (int i = 0; i < dest.length; i++) {
                   System.out.println(dest[i] + " ");
               }
           }
       }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int dist[] = dijkstraj(graph, src);
        for(int i=0; i<dist.length; i++) {
            System.out.println(dist[i]+" ");
        }
    }

}
