package Lessons.graphs;

import java.util.*;

public class bipartite {
    /*
     * graph
     * 
     *           0 ---- 2
     *          /     /  
     *         /     /   
     *        /     4    
     *       1     /     FALSE
     *        \   /          
     *         \ /
     *          3
     */
    static class Edge{
        int src, dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    static void generateGraph(ArrayList<Edge>[] graph){
                for(int i=0; i < graph.length; i++){
                    graph[i] = new ArrayList<>();
                }

                // node 0 and it's neighbours
                graph[0].add(new Edge(0, 1));
                graph[0].add(new Edge(0, 2));

                // node 1 and it's neighbours
                graph[1].add(new Edge(1, 3));
                graph[1].add(new Edge(1, 0));

                // node 2 and it's neighbours
                graph[2].add(new Edge(2, 4));
                graph[2].add(new Edge(2, 0));

                // node 3 and it's neighbours
                graph[3].add(new Edge(3, 4));
                graph[3].add(new Edge(3, 1));
    }

    static boolean isbi(ArrayList<Edge>[] graph){
        int colour[] = new int[graph.length];
        for(int i=0; i<colour.length; i++){
            colour[i] = -1; // initially all the colours are -1 i.e no colours
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(colour[i] == -1){
                // isbiUtil() follows
                q.add(i); // 
                colour[i] = 0;
                while(!q.isEmpty()){
                    int current = q.remove();
                    for(int j=0; j<graph[current].size(); j++){
                        Edge e = graph[current].get(j);

                        if(colour[e.dest] == -1){
                            colour[e.dest] = colour[current] == 0 ? 1 : 0;
                            q.add(e.dest);
                        }else if(colour[e.dest] == colour[current]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        generateGraph(graph);
        System.out.println(isbi(graph));
    }
}
