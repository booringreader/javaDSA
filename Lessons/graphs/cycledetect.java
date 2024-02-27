package Lessons.graphs;
import java.util.ArrayList;

/*
 *          0 ------ 3
 *        / |        |
 *       /  |        |
 *      1   |        4
 *       \  |
 *        \ |
 *          2
 * 
 */
public class cycledetect {
    static class Edge{
        int src, dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 3));
    }
    public static boolean cyclepresent(ArrayList<Edge>[] graph){
        // track the nodes using array
        boolean visit[] = new boolean[graph.length];

        // dfs
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                if(cyclepresentUtil(graph, visit, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    // dfsUtil
    public static boolean cyclepresentUtil(ArrayList<Edge>[] graph, boolean visit[], int current, int parent){ // parent is different from source, source(of the edge) is the current one, parent is the previous one
        visit[current] = true;
        for(int i=0; i<graph[current].size(); i++){
            Edge e = graph[current].get(i);
            if(!visit[e.dest]){
                if(cyclepresentUtil(graph, visit, e.dest, current)){
                    return true;
                }
            }else if (visit[e.dest]){
                if(parent != e.dest){
                    return true;
                }else{
                    continue;
                }
            }
        }
        return false; 
    }
    public static void main(String args[]){
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(cyclepresent(graph));
    }
}
