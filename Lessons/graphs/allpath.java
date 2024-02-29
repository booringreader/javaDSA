package Lessons.graphs;

import java.util.ArrayList;

public class allpath {
    static class Edge{
        int src, dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void generateGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void allp(ArrayList<Edge>[] graph, int src, int dest, String path){
        if(src == dest){
            System.out.print(path+dest);
            return;
        }
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            allp(graph, e.dest, dest, path+src);
        }
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        generateGraph(graph);
        allp(graph, 5, 1, "");
    }
}
