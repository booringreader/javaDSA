package graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class primsAlgo {
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

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    static class Pair implements Comparable<Pair>{
        int v, cost;
        public Pair(int v, int c){
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalcost = 0; // MST cost/weight (min)

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.v]){
                visited[curr.v] = true;
                finalcost += curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.weight));
                }
            }
        }
        System.out.println("final cost: " + finalcost);
    }
    public static void main(String[] args){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        generateGraph(graph);
        prims(graph);
    }
}
