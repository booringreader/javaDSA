package Lessons.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topoSort_bfs {
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

    static void topo(ArrayList<Edge>[] graph){
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        calcIndeg(graph, indeg);

        for(int i=0; i<graph.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        // bfs (if indeg not 0)
        // current element will be printed and removed from the queue, then we will use the neighbours of the 'current' element to continue our process

        while(!q.isEmpty()){
            int current = q.remove();
            System.out.print(current + " "); // remove and print the current; movign forward, the neighbours will be scrutinized

            for(int i=0; i<graph[current].size(); i++){
                Edge e = graph[current].get(i);
                indeg[e.dest]--; // get the neighbour and reduce it's degree (current is removed)

                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }
    static void calcIndeg(ArrayList<Edge>[] graph, int indeg[]){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                indeg[e.dest]++; // calculate indeg of all the nodes 
            }
        }
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        generateGraph(graph);
        topo(graph);
    }
}
