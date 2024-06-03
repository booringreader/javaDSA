/*
 *          0 ---- 1 --- 3 --- 5
 *          |     /      |    /
 *          |    /       |   /
 *          |   /        |  /
 *          |  /         | /
 *           2 --------- 4
 */

package Lessons.graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstra {
    static class Edge{
        int src, dest, weight;
        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }
    static void generateGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair>{
        int n, path;
        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path; // smaller value returned first
        }
    }
    public static void diji(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length]; // array to track distanct from src
        boolean visited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){ // until all the nodes are covered
            // initialisation
            if(i != src){ // if i==src do nothing, the distance is 0 (initialised with 0)
                dist[i] = Integer.MAX_VALUE; // if i not src then make all other nodes infinity 
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
            pq.add(new Pair(src, 0));
            while(!pq.isEmpty()){
                Pair curr = pq.remove(); // remove the shortest distance node
                if(!visited[curr.n]){
                    visited[curr.n] = true;
                    for(int i=0; i<graph[curr.n].size(); i++){
                        Edge e = graph[curr.n].get(i);
                        int u = e.src;
                        int v = e.dest;
                        int wt = e.weight;

                        if(dist[u] + wt < dist[v]){
                            dist[v] = dist[u] + wt;
                            pq.add(new Pair(v, dist[v]));
                        }
                    }
                }
            }
            for(int i=0; i<dist.length; i++){
                System.out.println(dist[i] + " ");
            }
            System.out.println();
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        generateGraph(graph);
        int src = 0;
        diji(graph, src);         
    }
}
