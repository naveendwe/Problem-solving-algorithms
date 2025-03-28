package com.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphExam {

       static class Edge{
            int src, dest, weight;
            Edge(int src, int dest, int weight){
               this.src = src; // from
               this.dest = dest;  //to
               this.weight = weight; // weight of from and To of edges
            }
       }
       static void crateGraph(ArrayList<Edge> graph[]){
           for(int i = 0;i<graph.length;i++){
               graph[i] = new ArrayList<>();
           }
           graph[0].add(new Edge(0, 2, 1));

           graph[1].add(new Edge(1,2,1));
           graph[1].add(new Edge(1,3,1));

           graph[2].add(new Edge(2,0,1));
           graph[2].add(new Edge(2,1,1));
           graph[2].add(new Edge(2,3,1));

           graph[3].add(new Edge(3,1,1));
           graph[3].add(new Edge(3,2,1));
       }
       public static void bfs(ArrayList<Edge> graph[], int V){
           Queue<Integer> queue = new LinkedList<Integer>();
           boolean vis[] = new boolean[V];
           queue.add(0);
           while(!queue.isEmpty()){
                 int curr = queue.remove();
                 if(!vis[curr]){
                     vis[curr] = true;
                     for(int i = 0; i<graph[curr].size();i++){
                         Edge edge = graph[curr].get(i);
                         queue.add(edge.dest);
                     }
                 }
           }

       }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        crateGraph(graph);

        for(int i = 0; i < graph[1].size();i++){
            Edge edge = graph[1].get(i);
            System.out.print(edge.dest + " -> ");
        }
    }
}
