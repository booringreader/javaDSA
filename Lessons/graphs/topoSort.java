package Lessons.graphs;
import java.util.ArrayList;
import java.util.Stack;

public class topoSort {
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
        Stack<Integer> s = new Stack<>();
        boolean visit[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            //checks if the node is visited, if not pass it to the util function to carrry out the dfs
            if(!visit[i]){
                topoUtil(graph, i, visit, s); // util function with the standard(+modified) dfs code
            }
        }
        // util function will return back to this point only once and that is after the final node in one section (if disconnected graph) is visited.
        // print the stack
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    static void topoUtil(ArrayList<Edge> graph[], int current, boolean visit[], Stack s){
        visit[current] = true; // since the received node was not visited, mark it visited

        // begin traversing through the edges of the current node 
        for(int i=0; i<graph[current].size(); i++){ 
            // this code gets the information on the edges one at a time; if no edges found, loop will break
            Edge e = graph[current].get(i); 

            // if the node on the øther side of the edge is also not visited, then pass it to the util function to carry out the dfs
            if(!visit[e.dest]){ 
                topoUtil(graph, e.dest, visit, s);
            }
        }
        // after the traversals are finished, add the current node to the stack (the neghbour nodes / successive nodes, will be added during recursion calls) 
        s.add(current);
        
        // return from the util, to the OG.
        return;
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        generateGraph(graph);
        topo(graph);
    }
}
