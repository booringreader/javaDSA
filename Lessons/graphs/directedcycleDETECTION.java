package Lessons.graphs;
import java.util.ArrayList;

public class directedcycleDETECTION {
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

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    static boolean isCycle(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length]; // to track all the visited nodes
        boolean stack[] = new boolean[graph.length]; // to track the neighbour nodes called in one continuous recursion call

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(isCycleUtil(graph, i, visited, stack)){
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isCycleUtil(ArrayList<Edge>[] graph, int current, boolean visited[], boolean stack[]){
        visited[current] = true;
        stack[current] = true;

        for(int i=0; i<graph[current].size(); i++){ // traverse through all the edges of the current node
            Edge e = graph[current].get(i); // get each edge of the current node until the number of cycles equal to the number of edges for this node are covered
            
            // to check if the neighbour node has already been called by the current recursion call (i.e we have come back to a node that has already been passed)
            if(stack[e.dest]){
                return true;
            }

            // in case we haven't even visited the neighbouring node yet
            if(!visited[e.dest]){
                if(isCycleUtil(graph, e.dest, visited, stack)){
                    return true;
                }
            }
        }
        // recursion call comes back, hence the corresponding array keeping track of visited nodes in that particular call should rollback too
        stack[current] = false;
        return false; // when all the edges have been traversed and there was none which could form a cycle OR there was no edge (directed graph)
    }

    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        generateGraph(graph);
        System.out.println(isCycle(graph));
    }
}
