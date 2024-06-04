package graphs;

import java.util.ArrayList;

public class bellmanFord {
   static class Edge{
        int src, dest, weight;
        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }
    static void generateGraph2(ArrayList<Edge> graph){
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    } 

    public static void bellford(ArrayList<Edge> graph, int src, int V){
        int dist[] = new int[V];
        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int i=0; i<(V-1); i++){
            for(int j=0; j<graph.size(); j++){
                    Edge e = graph.get(j);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.println(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int V = 5; 
        // ArrayList<Edge> graph[] = new ArrayList[V];
        ArrayList<Edge> graph = new ArrayList<>();
        generateGraph2(graph);
        bellford(graph, 0, V);
    }
}
