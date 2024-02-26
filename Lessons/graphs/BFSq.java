/*
 * BFS (breadth first search): 
 * [being at a node, recording it's neighbours (nodes at the opposite end of the edge connecting the current node), 
 * performing (if any) operations of the neighbours - mvoing on to one of the neighbour nodes ]
 * repeat the process
 * 
 * to record neighbours we use queue
 * to keep track of the visited nodes we use an array (since we're assuming all the nodes as 0 indexed numbers for now)
 */
package Lessons.graphs;
import java.util.*;

public class BFSq {
    /*
     *      0 -- 1 - 3 ----- 5 ------- 6
     *      |        |       |    
     *      |        |       |   
     *      2 ------ 4 -------
     */

    static class Edge{
        int src, dest, wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void generateGraph(ArrayList<Edge>[] graph){
                for(int i=0; i < graph.length; i++){
                    graph[i] = new ArrayList<>();
                }

                graph[0].add(new Edge(0, 1, 1));
                graph[0].add(new Edge(0, 2, 1));
                
                graph[1].add(new Edge(1, 3, 1));
                graph[1].add(new Edge(1, 0, 1));

                graph[2].add(new Edge(2, 4, 1));
                graph[2].add(new Edge(2, 0, 1));

                graph[3].add(new Edge(3, 4, 1));
                graph[3].add(new Edge(3, 1, 1));
                graph[3].add(new Edge(3, 5, 1));

                graph[4].add(new Edge(4, 2, 1));
                graph[4].add(new Edge(4, 5, 1));
                graph[4].add(new Edge(4, 3, 1));

                graph[5].add(new Edge(5, 6, 1));
                graph[5].add(new Edge(5, 3, 1));
                graph[5].add(new Edge(5, 4, 1));

                graph[6].add(new Edge(6, 5, 1));
    }
    
    static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> travel = new LinkedList<>(); //
        boolean visited[] = new boolean[graph.length]; // array to track visited nodes

        // passing in source
        travel.add(0); 

        while(!travel.isEmpty()){
            int current = travel.remove();
             
            if(!visited[current]){ // then visit and add neighbours to queue
                System.out.println("current: " + current); // print current node
                visited[current] = true;
                //travel through graph, get all the edges of current node and then get all the destinations
                for(int i=0; i < graph[current].size(); i++){  // graph[current].size() gives the number of edges of the current node
                    Edge e = graph[current].get(i);
                    travel.add(e.dest); // add the neighbour of current node to queue
                }
            }
        }
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        generateGraph(graph);
        bfs(graph);
    }
}